package de.othr.interfaces_java;

import de.othr.interfaces.Printable;

import java.util.Arrays;

public class Person implements Comparable, Printable {
    private String name;
    private int alter;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void erhoeheAlter() {
        this.alter++;
    }

    public Person() {
    }

    public Person(String name, int alter) {
        this();
        this.name = name;
        this.alter = alter;
    }

    public Person(String vorname, String nachname) {
        this(vorname+" "+nachname);
    }
    //...
    @Override
    public int compareTo(Object other) {
        if(!(other instanceof Person)) {
            return -1;
        }
        return this.alter - ((Person) other).alter;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Peter", 20);
        Person p2 = new Person("Ute", 19);

        if(p1.compareTo(p2) > 0) {
            System.out.println("Peter ist aelter als Ute");
        }

        Person[] personen = {
                new Person("Peter", 20),
                new Person("Ute", 19),
                new Person("Otto", 70),
                new Person("Tim", 8) };

        Arrays.sort(personen);
        for(Person p : personen) {
            p.print();
        }
    }

    @Override
    public void print() {
        System.out.printf("%s (%d)\n",name, alter);
    }
}
