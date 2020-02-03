package de.othr;

import java.util.LinkedList;
import java.util.List;

public abstract class Spieler {
    private String name;
    protected List<Karte> karten = new LinkedList<Karte>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void zieheKarte() {
        karten.add(new Karte());
    }

    public int anzahlKarten() {
        return karten.size();
    }

    public void printKarten() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < karten.size(); i++) {
            s.append("[" + (i + 1) + "] " + karten.get(i) + ", ");
        }
        System.out.println(s.substring(0, s.length() - 2));
    }

    /**
     * Legt die gegebene Karte auf die aktuell ausgespielte Karte
     * @param kartenr Welche Karte soll gespielt werden?
     * @param aktuelleKarte Welche Karte liegt aktuell aus?
     * @return Die gespielte Karte.
     * @throws IllegalAccessException Wenn die zu spielende Karte nicht passt.
     * @throws IndexOutOfBoundsException Wenn es die Karte nicht gibt.
     */
    Karte legeKarte(int kartenr, Karte aktuelleKarte) throws IllegalAccessException, IndexOutOfBoundsException {
        Karte karte;
        karte = karten.get(kartenr);

        if (!karte.kannGelegtWerdenAuf(aktuelleKarte)) {
            throw new IllegalAccessException();
        }
        karten.remove(kartenr);
        return karte;
    }

    /**
     * Legt eine Karte auf die aktuell ausgespielte Karte.
     * @param aktuelleKarte Welche Karte liegt aktuell aus?
     * @return Die gespielte Karte.
     */
    public abstract Karte legeKarte(Karte aktuelleKarte);
}
