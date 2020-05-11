package de.othr.exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DateiLesenThrows {
    public static void main(String[] args) throws Exception {
        printDatei(System.getProperty("user.home")+  File.separator + "test.txt");
    }

    public static void printDatei(String dateiname) throws IOException {
        FileReader fr = new FileReader(dateiname);
        BufferedReader br = new BufferedReader(fr);

        String zeile;

        while ((zeile = br.readLine()) != null) {
            System.out.println(zeile);
        }

        br.close();
    }

    public static void printDatei2(String dateiname) throws IOException {
        try {
            FileReader fr = new FileReader(dateiname);
        } catch (IOException e) {
            System.out.println("Beim Datei-Lesen ist etwas schief gelaufen.");
            throw e;
        }
    }

    public static void printDatei3(String dateiname) throws IOException {
        try {
            FileReader fr = new FileReader(dateiname);
        } catch (IOException e) {
            throw new IOException("Fehler beim Lesen der Datei");
        }
    }


}
