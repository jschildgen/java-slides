package de.othr.varargs;

public class Geld {
    public static final String WAEHRUNG = "EUR";

    public static double addieren(double... args) {
        double summe = 0;
        for(double a : args) { summe += a; }
        return summe;
    }

    public static double subtrahieren(double a, double b) {
        return Geld.addieren(a, -b);
    }

    public static void main(String... args) {
        System.out.printf("Kontostand: %.2f %s",
                Geld.addieren(500, 100), Geld.WAEHRUNG);
    }
}
