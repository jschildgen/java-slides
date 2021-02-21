package de.othr.lambda;

import java.util.List;
import java.util.function.Consumer;

public class AnonymeBeispiel {


    public static void main(String[] args) {
        List<String> einkaufsliste = List.of("Tomaten", "Käse", "Zahnpasta");
        einkaufsliste.forEach(s -> System.out.println(s));

        Consumer consumer =
        new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        einkaufsliste.forEach(consumer);
    }
}
