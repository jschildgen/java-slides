package de.othr.rechnen;

public class Geld {
    public static final String WAEHRUNG = "EUR";

    public static double addieren(double a, double b) {
        return a+b;
    }

    public static double subtrahieren(double a, double b) {
        return Geld.addieren(a, -b);
    }

    public static void main(String[] args) {
        System.out.printf("Kontostand: %.2f %s",
                Geld.addieren(500, 100), Geld.WAEHRUNG);
    }
}
