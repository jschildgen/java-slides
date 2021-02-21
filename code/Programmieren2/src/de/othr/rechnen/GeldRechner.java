package de.othr.rechnen;

import static de.othr.rechnen.Geld.*;

public class GeldRechner {
    public static void main(String[] args) {
        double summe = addieren(5.7, 3.5);
        System.out.printf("%.2f %s", summe, WAEHRUNG);
    }
}
