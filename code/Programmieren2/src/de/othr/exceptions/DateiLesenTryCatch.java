package de.othr.exceptions;
import java.io.*;
public class DateiLesenTryCatch {
    public static void main(String[] args) {
        String dateiname = System.getProperty("user.home")+  File.separator + "test.txt";
        printDatei(dateiname); printDatei2(dateiname); printDatei3(dateiname); printDatei4(dateiname); printDatei5(dateiname);

    }

    public static void printDatei(String dateiname) {
        try {
            FileReader fr = new FileReader(dateiname);
        } catch (FileNotFoundException e) {
            System.out.println("Die Datei existiert nicht.");
            return;
        }
        // ...
    }

    public static void printDatei2(String dateiname) {
        try {
            FileReader fr = new FileReader(dateiname);
            BufferedReader br = new BufferedReader(fr);
            String zeile;
            while ((zeile = br.readLine()) != null) {
                System.out.println(zeile);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Die Datei existiert nicht.");
            return;
        } catch (IOException e) {
            System.out.println("Fehler beim Lesen der Datei.");
            return;
        }
    }



    public static void printDatei3(String dateiname) {
        try {
            FileReader fr = new FileReader(dateiname);
            BufferedReader br = new BufferedReader(fr);
            String zeile;
            while ((zeile = br.readLine()) != null) {
                System.out.println(zeile);
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            System.out.println("Fehler: " + e.getMessage());
            return;
        }

        try {
            // nix
        } catch (Exception e) {
            System.out.println("Fehler: " + e.getMessage());
            return;
        }
    }


    public static void printDatei4(String dateiname) {
        FileReader fr;
        try {
            fr = new FileReader(dateiname);
        } catch(FileNotFoundException e) {
            System.out.println("Die Datei existiert nicht.");
            return;
        }
        BufferedReader br = new BufferedReader(fr);
        try {
            String zeile;
            while ((zeile = br.readLine()) != null) {
                System.out.println(zeile);
            }
        } catch (IOException e) {
            System.out.println("Fehler beim Lesen der Datei.");
            return;
        } finally {
            try {
                br.close();
            } catch (IOException e) { }
        }
    }



    public static void printDatei5(String dateiname) {
        try(BufferedReader br = new BufferedReader(new FileReader(dateiname))) {
            String zeile;
            while ((zeile = br.readLine()) != null) {
                System.out.println(zeile);
            }
        } catch (IOException e) {
            System.out.println("Fehler beim Lesen der Datei.");
            return;
        }
    }
}
