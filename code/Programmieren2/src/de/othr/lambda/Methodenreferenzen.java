package de.othr.lambda;

import java.util.List;

public class Methodenreferenzen {
    public static void main(String[] args) {
        List<Integer> zahlen = List.of(5, 9, 27, 3, 17, 2);

        zahlen.forEach(System.out::println);
        zahlen.forEach(s -> System.out.println(s));

        {
            Integer max = zahlen.stream().reduce(Math::max).get();
            System.out.println(max);
        }

        {
            Integer max = zahlen.stream().reduce((x,y) -> Math.max(x,y)).get();
            System.out.println(max);
        }

        List<String> einkaufsliste = List.of("Tomaten", " ", "Zahnpasta");
        {
            long anzahl = einkaufsliste.stream().filter(String::isBlank).count();
            System.out.println(anzahl);
        }

        {
            long anzahl = einkaufsliste.stream().filter(s -> s.isBlank()).count();
            System.out.println(anzahl);
        }


        einkaufsliste.stream().map(String::length).forEach(zahlen::add);

        einkaufsliste.stream().map(s -> s.length()).forEach(n -> zahlen.add(n));

    }
}
