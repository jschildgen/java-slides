package de.othr;

public class MauMau {

    public static void main(String[] args) {
        Spieler[] spieler = { new MenschlicherSpieler(), new ComputerGegner() };

        // Jeder Spieler zieht fünf Karten
        for(Spieler s:spieler) {
            for(int i = 1; i<=5; i++) {
                s.zieheKarte();
            }
        }

        // Zuerst wird eine zufällige Karte aufgedeckt
        Karte aktuelleKarte = new Karte();
        System.out.println("Es geht los mit: " + aktuelleKarte);

        Spiel:
        while(true) {
            for(Spieler s : spieler) {
                // Jeder Spieler legt eine Karte auf die aktuell ausgelegte Karte
                aktuelleKarte = s.legeKarte(aktuelleKarte);
                if (aktuelleKarte == null) {
                    // Spieler kann nicht legen
                    System.out.println(s.getName() + " hat verloren.");
                    break Spiel;
                }
                System.out.println(s.getName()+" legt: "+aktuelleKarte);
                if (s.anzahlKarten() == 0) {
                    // Spieler hat keine Karten mehr
                    System.out.println(s.getName() + " hat gewonnen.");
                    break Spiel;
                }
            }
        }
    }
}