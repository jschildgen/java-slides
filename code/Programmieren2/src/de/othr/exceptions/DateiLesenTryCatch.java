package de.othr.exceptions;
import java.io.*; import java.nio.file.*;
public class DateiLesenTryCatch {
    public static void main(String[] args) {
        String dateiname = System.getProperty("user.home")+  File.separator + "test.txt";
        printDatei(dateiname); printDatei2(dateiname); printDatei3(dateiname); printDatei4(dateiname); printDatei5(dateiname);

    }

    public static void printDatei(String dateiname) {
        try {
            Path datei = Paths.get(dateiname);
            BufferedReader br = Files.newBufferedReader(datei);
        } catch (IOException e) {
            System.out.println("Die Datei kann nicht geöffnet werden.");
            return;
        }
        // ...
    }
    public static void printDatei2(String dateiname) {
        try {
            Path datei = Paths.get(dateiname);
            BufferedReader br = Files.newBufferedReader(datei);
            String zeile;
            while ((zeile = br.readLine()) != null) {
                System.out.println(zeile);
            }
            br.close();
        } catch (NoSuchFileException e) {
            System.out.println("Die Datei existiert nicht.");
            return;
        } catch (IOException e) {
            System.out.println("Fehler beim Lesen der Datei.");
            return;
        }
    }



    public static void printDatei3(String dateiname) {
        try {
            Path datei = Paths.get(dateiname);
            BufferedReader br = Files.newBufferedReader(datei);
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
        Path datei = Paths.get(dateiname);
        BufferedReader br = null;
        try {
            br = Files.newBufferedReader(datei);
            String zeile;
            while ((zeile = br.readLine()) != null) {
                System.out.println(zeile);
            }
        } catch (IOException e) {
            System.out.println("Fehler beim Lesen der Datei.");
            return;
        } finally {
            try {
                if(br != null) { br.close(); }
            } catch (IOException e) { }
        }
    }







    public static void printDatei5(String dateiname) {
        Path datei = Paths.get(dateiname);
        try(BufferedReader br = Files.newBufferedReader(datei)) {
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
