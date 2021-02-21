package de.othr.webapp;

import static spark.Spark.*;

public class Main {

    // Programm starten und dann http://localhost:4567/ im Browser öffnen
    public static void main(String[] args) {
        get("/", (req, res) ->
         "<html><body><h1>Hallo!</h1></body></html>");
    }
}
