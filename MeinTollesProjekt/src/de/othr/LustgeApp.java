package de.othr;

import com.company.Person;

import java.util.Scanner;


public class LustgeApp {



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String eingabe;
        do {
            System.out.print("Was sagst du? ");
            eingabe = scan.nextLine();
            System.out.println("Ich schreie zurück: "
                    +eingabe.toUpperCase());
        } while(!eingabe.isBlank());



    }
}
