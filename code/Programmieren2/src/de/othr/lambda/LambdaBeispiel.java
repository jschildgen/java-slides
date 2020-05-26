package de.othr.lambda;

import java.util.List;
import java.util.function.*;

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


    }
}
