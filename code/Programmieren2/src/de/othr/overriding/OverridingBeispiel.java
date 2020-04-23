package de.othr.overriding;

public class OverridingBeispiel {
    public static void main(String[] args) {
        Person[] personen =
                { new Person("Peter"),
                  new Studierender("Ute", 123456) };

        for(Person p : personen) {
            System.out.println(p.getDetails());
        }

        for(Person p : personen) {
            System.out.println(p);
        }
    }
}
