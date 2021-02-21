package de.othr.lambda;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class LambdaBeispiel {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Hallo");

        List<String> einkaufsliste = List.of("Tomaten", "Käse", "Zahnpasta");
        einkaufsliste.forEach(s -> System.out.println(s));

        einkaufsliste.forEach(s -> {
            System.out.print("[ ] ");
            System.out.println(s);
        });

        Function<String, Integer> laenge = s -> s.length();
        System.out.println(laenge.apply("Hallo"));

        UnaryOperator<Integer> quadrat = n -> n*n;
        System.out.println(quadrat.apply(5));

        Predicate<Integer> ungerade = n -> n%2 == 1;
        if(ungerade.test(17)) {
            System.out.println("17 ist ungerade!");
        }

        // Wie viele Einträge auf der Einkaufsliste enden mit "a"?
        long anzahl = einkaufsliste.stream()
                        .filter(s -> s.endsWith("a"))
                        .count();

        System.out.println(anzahl);

        // Wandle jeden Eintrag in Großbuchstaben, sortiere
        // und erzeugen aus den ersten beiden Einträge eine neue Liste
        List<String> l_neu = einkaufsliste.stream().map(s -> s.toUpperCase())
                                        .sorted()
                                        .limit(2)
                                        .collect(Collectors.toList());

        // Berechne die Summe der Längen der einzelnen Einträge
        long anzahl_zeichen = einkaufsliste.stream()
                        .map(s -> s.length())
                        .reduce((x,y) -> x+y)
                        .get();

        System.out.println(anzahl_zeichen);


        Map<String, String> en_de = new HashMap<>();
        en_de.put("cat", "Katze");
        en_de.put("dog", "Hund");

        en_de.forEach((de, en) -> System.out.println(de+" heißt "+en));
    }
}
