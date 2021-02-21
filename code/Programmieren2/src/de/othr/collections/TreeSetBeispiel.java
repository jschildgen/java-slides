package de.othr.collections;

import de.othr.interfaces_java.Person;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetBeispiel {
    public static void main(String[] args) {
        Set<Person> personen = new TreeSet<>();

        personen.add(new Person("Peter", 20));
        personen.add(new Person("Ute", 19));
        personen.add(new Person("Otto", 70));
        personen.add(new Person("Tim", 8));

        for(Person p : personen) {
            System.out.printf("%s (%d)\n", p.getName(), p.getAlter());
        }
    }
}
