package de.othr.exceptions;

import java.util.Scanner;

public class TryCatchMultiBeispiel {
    private static Scanner scan;

    public static void main(String[] args) throws java.util.InputMismatchException {
        scan = new Scanner(System.in);

        wochentag_weahlen();
        //wochentag_weahlen2();
    }

    public static String wochentag_weahlen() {
        String[] tage = {"So", "Mo", "Di", "Mi", "Do", "Fr", "Sa"};
        System.out.print("Bitte Wochentag wählen [0-6]: ");
        try {
            int index = Integer.parseInt(scan.nextLine());
            return tage[index];
        } catch (NumberFormatException e) {
            System.out.println("Es wurde keine Zahl eingegeben!");
            return wochentag_weahlen();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ungültiger Wochentag!");
            return wochentag_weahlen();
        }
    }

    public static String wochentag_weahlen2() {
        String[] tage = {"So", "Mo", "Di", "Mi", "Do", "Fr", "Sa"};
        System.out.print("Bitte Wochentag wählen [0-6]: ");
        try {
            int index = Integer.parseInt(scan.nextLine());
            return tage[index];
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Fehler: " + e.getMessage());
            return wochentag_weahlen();
        }
    }

    public static String wochentag_weahlen3() {
        String[] tage = {"So", "Mo", "Di", "Mi", "Do", "Fr", "Sa"};
        System.out.print("Bitte Wochentag wählen [0-6]: ");
        try {
            int index = Integer.parseInt(scan.nextLine());
            return tage[index];
        } catch (Exception e) {
            System.out.println("Fehler: " + e.getMessage());
            return wochentag_weahlen();
        }
    }
}