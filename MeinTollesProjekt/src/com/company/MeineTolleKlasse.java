package com.company;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MeineTolleKlasse {

    public static void main(String[] args) {


        Consumer<Integer> f = x -> { for(int i = 0; i<x; i++) { System.out.println("Hallo"); } };

        List<String> einkaufsliste = new ArrayList<>();
        einkaufsliste.add("Tomaten");
        einkaufsliste.add("");
        einkaufsliste.add("");
        einkaufsliste.add("");
        einkaufsliste.add("Käse");
        einkaufsliste.add("Trauben");

        einkaufsliste.stream()
                .filter(s -> s.isEmpty())
                .sorted((s1, s2) -> s1.compareTo(s2))
                .skip(1)
                .limit(2)
                .forEach(System.out::println);


        List<Integer> zahlen = new ArrayList<>();

        zahlen.add(5);

        Optional<Integer> kleinste = zahlen.stream().min((a, b) -> a-b);
        System.out.println(kleinste.orElse(-1));



    }




}
