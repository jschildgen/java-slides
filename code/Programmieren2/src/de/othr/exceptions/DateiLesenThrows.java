package de.othr.exceptions;

import java.io.*;

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

    public static void printDatei4(String dateiname) throws MeineEigeneException {
        try {
            FileReader fr = new FileReader(dateiname);
        } catch (FileNotFoundException e) {
            throw new MeineEigeneException("Fehler beim Lesen der Datei");
        }
    }


}
