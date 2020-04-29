package de.othr.exceptions;

import java.util.Scanner;

public class ThrowBeispiel {
    private static Scanner scan;

    public static void main(String[] args) throws java.util.InputMismatchException {
        scan = new Scanner(System.in);

        String[] tage = { "So", "Mo", "Di", "Mi", "Do", "Fr", "Sa" };
        zahl_eingeben();
    }

    public static int zahl_eingeben() throws NumberFormatException {
        System.out.print("Bitte Wochentag wählen [0-6]: ");
        try {
            return Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Es wurde keine Zahl eingegeben!");
            throw e;
        }
    }

    public static int zahl_eingeben2() throws NumberFormatException {
        System.out.print("Bitte Wochentag wählen [0-6]: ");
        try {
            return Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Es wurde keine Zahl eingegeben!");
        }
    }
}
