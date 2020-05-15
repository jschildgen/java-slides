package de.othr.collections;

import java.util.HashSet;
import java.util.Set;

public class SetBeispiel {
    public static void main(String[] args) {
        Set<String> wunschzettel = new HashSet<>();
        wunschzettel.add("Kaffeemaschine");
        wunschzettel.add("Beamer");
        wunschzettel.add("Kaffeemaschine");

        System.out.printf("%d Einträge auf dem Wunschzettel:\n",
                wunschzettel.size());       // 2

        for (String eintrag: wunschzettel) {
            System.out.println("[_] "+eintrag);
        }

        if(wunschzettel.contains("Beamer")) {
            System.out.println("Der Beamer steht drauf.");
        }
        wunschzettel.remove("Beamer");
    }
}
