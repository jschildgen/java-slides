package de.othr.exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class DateiLesen {
    public static void main(String[] args) {
        printDatei(System.getProperty("user.home")+  File.separator + "test.txt");
    }

    public static void printDatei(String dateiname) {
        try {
        FileReader fr = new FileReader(dateiname);
        BufferedReader br = new BufferedReader(fr);

        String zeile;

        while ((zeile = br.readLine()) != null) {
            System.out.println(zeile);
        }

        br.close();
        } catch(IOException e) {}
    }
}
