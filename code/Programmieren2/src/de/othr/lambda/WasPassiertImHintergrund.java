package de.othr.lambda;

import java.util.List;
import java.util.function.Predicate;

public class WasPassiertImHintergrund {
    public static void main(String[] args) {
        List<String> einkaufsliste = List.of("Tomaten", "Käse", "Zahnpasta");
        long anzahl;
        anzahl = einkaufsliste.stream().filter(String::isBlank).count();
        anzahl = einkaufsliste.stream().filter(s -> s.isBlank()).count();
        anzahl = einkaufsliste.stream().filter((String s) -> s.isBlank()).count();
        anzahl = einkaufsliste.stream().filter((String s) ->
                                            { return s.isBlank(); }).count();
        anzahl = einkaufsliste.stream().filter(new Predicate<String>() {
                                                @Override
                                                public boolean test(String s) {
                                                    return s.isBlank();
                                                }
                                               }).count();

    }
}
