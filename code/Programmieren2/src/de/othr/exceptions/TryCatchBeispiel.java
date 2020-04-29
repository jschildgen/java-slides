package de.othr.exceptions;

import java.util.Scanner;

public class TryCatchBeispiel {
    private static Scanner scan;

    public static void main(String[] args) throws java.util.InputMismatchException {
        scan = new Scanner(System.in);


        zahl_eingeben();
    }

    public static int zahl_eingeben() {
        System.out.print("Bitte Zahl eingeben: ");
        try {
            return Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Es wurde keine Zahl eingegeben!");
            return zahl_eingeben();
        }
    }
}
