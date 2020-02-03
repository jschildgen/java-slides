package de.othr;

import java.util.Random;

public class Karte {
    enum FARBE { SCHWARZ, ROT }

    private static Random RANDOM = new Random();

    private FARBE farbe;
    private int wert;

    public FARBE getFarbe() {
        return farbe;
    }

    public void setFarbe(FARBE farbe) {
        this.farbe = farbe;
    }

    public int getWert() {
        return wert;
    }

    public void setWert(int wert) {
        if(wert < 7 || wert > 10) {
            throw new IllegalArgumentException("Es gibt nur die Kartenwerte 7, 8, 9 und 10");
        }
        this.wert = wert;
    }

    public Karte(FARBE farbe, int wert) {
        this.setFarbe(farbe);
        this.setWert(wert);
    }

    public Karte() {
        this.setFarbe(RANDOM.nextInt(2) == 0 ? FARBE.SCHWARZ : FARBE.ROT);
        this.setWert(7+RANDOM.nextInt(4));
    }

    public boolean kannGelegtWerdenAuf(Karte other) {
        if(this.farbe.equals(other.farbe) || this.wert == other.wert) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String s = "";
        switch (farbe) {
            case SCHWARZ: s = "Schwarze "; break;
            case ROT: s = "Rote "; break;
        }
        s += wert;
        return s;
    }
}
