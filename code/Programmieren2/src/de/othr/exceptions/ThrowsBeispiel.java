package de.othr.exceptions;

import java.util.Scanner;

public class ThrowsBeispiel {
    private static Scanner scan;

    public static void main(String[] args) throws java.util.InputMismatchException {
        scan = new Scanner(System.in);

        String[] tage = { "So", "Mo", "Di", "Mi", "Do", "Fr", "Sa" };
        wochentag_weahlen();
    }

    public static int wochentag_weahlen() throws NumberFormatException {
        System.out.print("Bitte Wochentag wählen [0-6]: ");
        return Integer.parseInt(scan.nextLine());
    }
}
