package de.othr.exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;


public class DateiLesen {
    public static void main(String[] args) {
        printDatei(System.getProperty("user.home")+  File.separator + "test.txt");
    }

    public static void printDatei(String dateiname) {
        try {
        Path datei = Paths.get(dateiname);
        BufferedReader br = Files.newBufferedReader(datei);

        String zeile;

        while ((zeile = br.readLine()) != null) {
            System.out.println(zeile);
        }

        br.close();
        } catch(IOException e) { e.printStackTrace(); }
    }
}
