package de.othr.exceptions;

import java.io.*;
import java.nio.file.*;

public class DateiLesenThrows {
    public static void main(String[] args) throws Exception {
        printDatei(System.getProperty("user.home")+  File.separator + "test.txt");
    }



    public static void printDatei(String dateiname) throws IOException {
        Path datei = Paths.get(dateiname);
        BufferedReader br = Files.newBufferedReader(datei);

        String zeile;

        while ((zeile = br.readLine()) != null) {
            System.out.println(zeile);
        }

        br.close();
    }

    public static void printDatei2(String dateiname) throws IOException {
        try {
            BufferedReader br = Files.newBufferedReader(Paths.get(dateiname));
        } catch (IOException e) {
            System.out.println("Beim Datei-Lesen ist etwas schief gelaufen.");
            throw e;
        }
    }

    public static void printDatei3(String dateiname) throws IOException {
        try {
            BufferedReader br = Files.newBufferedReader(Paths.get(dateiname));
        } catch (IOException e) {
            throw new IOException("Fehler beim Lesen der Datei");
        }
    }

    public static void printDatei4(String dateiname) throws MeineEigeneException {
        try {
            FileReader fr = new FileReader(dateiname);
        } catch (FileNotFoundException e) {
            throw new MeineEigeneException("Fehler beim Lesen der Datei");
        }
    }


}
