package org.example;

import com.mongodb.DB;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.*;

import java.util.*;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));

        MongoDatabase db = mongoClient.getDatabase("paketdienst");

        MongoCollection<Document> pakete = db.getCollection("pakete");

        Thread.sleep(500);

        /* Suche nach Paketen über Absender oder Empfänger */

        String name = ask("Name: ");

        int i = 0;

        List<Object> paket_ids = new ArrayList<>();

        for(Document paket : pakete.find(new Document("$or",
                new BsonArray(List.of(new BsonDocument("absender", new BsonString(name)),
                        new BsonDocument("empfaenger.name", new BsonString(name))))))) {
            i++;
            System.out.printf("[%d] %s -> %s (%s)\n",
                    i,
                    paket.get("absender"),
                    ((Document)paket.get("empfaenger")).get("name"),
                    paket.get("status"));

            paket_ids.add(paket.get("_id"));
        }

        switch (ask("Was willst du machen [neu|paketanname]? ")) {
            case "neu":
                String empfaenger_name = ask("Empfängername: ");
                String empfaenger_ort = ask("Ort: ");

                pakete.insertOne(new Document().append("absender", name)
                        .append("empfaenger", new Document("name", empfaenger_name)
                                                   .append("ort", empfaenger_ort))
                        .append("last_updated", new Date())
                        .append("status", "unterwegs"));

                break;
            case "paketannahme":
                int number = Integer.parseInt(ask(String.format("Welches Paket [1..%d]? ", i)));
                Object _id = paket_ids.get(number-1);
                pakete.updateOne( new Document("_id", _id),
                        new Document("$set", new Document("status", "zugestellt")
                                                  .append("last_updated", new Date())));
                break;
            default: break;
        }

    }

    private static String ask(String question) {
        System.out.print(question);
        return SCANNER.nextLine();
    }
}