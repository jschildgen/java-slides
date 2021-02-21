package de.othr.spezielleklassen;

import de.othr.interfaces.Printable;

public class AnonymeKlasseBeispiel {
    public static void main(String[] args) {
        Printable p = new Printable() {
            @Override
            public void print() {
                System.out.println("Hallo!");
            }
        };
        p.print();
        main2(args);
    }

    public static void main2(String[] args) {
        class AnonymeKlasse implements Printable {
            @Override
            public void print() {
                System.out.println("Hallo!");
            }
        }
        Printable p = new AnonymeKlasse();
        p.print();
    }
}
