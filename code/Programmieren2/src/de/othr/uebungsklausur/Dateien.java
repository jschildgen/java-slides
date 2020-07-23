package de.othr.uebungsklausur;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Dateien {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Bitte einen Dateinamen eingeben: ");
            Path datei = Paths.get(scan.nextLine());
            datei_anlegen(datei);
        } catch (IOException e) {
            System.out.println("Die Datei konnte nicht angelegt werden.");
            return;
        }
    }

    private static void datei_anlegen(Path datei) throws IOException {
        Files.createFile(datei);
    }
}
