package de.othr.grundlagen;

import java.util.Scanner;

public class ScannerBeispiel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String eingabe;
        while(true) {
            System.out.print("Was sagst du? ");
            eingabe = scan.nextLine();
            if(eingabe.isBlank()) { break; }
            System.out.println("Ich schreie zurück: "
                    +eingabe.toUpperCase());
        }
    }
}
