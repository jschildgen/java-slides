package de.othr.collections;

import java.util.ArrayList;
import java.util.List;

public class ListBeispiel {
    public static void main(String[] args) {
        List<String> einkaufsliste = new ArrayList<>();
        if(einkaufsliste.isEmpty()) {
            System.out.println("Die Einkaufsliste ist leer.");
        }
        einkaufsliste.add("Tomaten");
        einkaufsliste.add("Käse");
        einkaufsliste.add("Zahnpasta");
        System.out.printf("%d Einträge auf der Einkaufsliste:\n",
                einkaufsliste.size());

        for (String eintrag: einkaufsliste) {
            System.out.println("[_] "+eintrag);
        }
        System.out.println("Erstes: "+einkaufsliste.get(0)); // Tomaten
        einkaufsliste.remove(2); // Löscht Zahnpasta
        einkaufsliste.remove("Tomaten");
        System.out.println("Erstes: "+einkaufsliste.get(0)); // Käse
    }
}
