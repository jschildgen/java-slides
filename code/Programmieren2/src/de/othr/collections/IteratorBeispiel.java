package de.othr.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorBeispiel {
    public static void main(String[] args) {
        List<String> einkaufsliste
                = List.of("Tomaten", "Käse", "Zahnpasta");

        Iterator<String> it = einkaufsliste.iterator();

        String aktuelles_element;
        while(it.hasNext()) {
            aktuelles_element = it.next();
            System.out.println(aktuelles_element);
        }

        foreach_version(einkaufsliste);
    }

    private static void foreach_version(List<String> einkaufsliste) {
        for(String aktuelles_element : einkaufsliste) {
            System.out.println(aktuelles_element);
        }
    }
}
