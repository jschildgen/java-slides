package de.othr.interfaces_java;

import java.util.Arrays;

public class ComparatorBeispiel {
    public static void main(String[] args) {
        Person[] personen = {
                new Person("Peter", 20),
                new Person("Ute", 19),
                new Person("Otto", 70),
                new Person("Tim", 8) };

        Arrays.sort(personen, new PersonNameComparator());

        for(Person p : personen) {
            p.print();
        }

        Arrays.sort(personen, (p1, p2) -> p1.getAlter() - p2.getAlter());

        Arrays.sort(personen, (p1, p2) -> p1.getName().compareTo(p2.getName()));
    }
}
