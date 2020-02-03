package de.othr;

import java.util.Scanner;

public class MenschlicherSpieler extends Spieler {

    private static final Scanner SCAN = new Scanner(System.in);

    public MenschlicherSpieler(String name) {
        setName(name);
    }

    public MenschlicherSpieler() {
        System.out.print("Wie ist dein Name? ");
        setName(SCAN.nextLine());
    }


    @Override
    public Karte legeKarte(Karte aktuelleKarte) {
        printKarten();
        Karte karte = null;

        while(karte==null) {
            System.out.print("Welche Karte? ");
            String eingabe;
            try {
                eingabe = SCAN.nextLine();
                if(eingabe.isBlank()) {
                    return null;
                }
                int kartenr = -1 + Integer.parseInt(eingabe);
                karte = legeKarte(kartenr, aktuelleKarte);
            } catch (IllegalAccessException e) {
                System.out.println("Passt nicht!");
            } catch (IndexOutOfBoundsException | NumberFormatException e) {
                System.out.println("Gibt's nicht!");
            }
        }

        return karte;
    }
}
