package de.othr.threads;

public class Konto {
    String inhaber;
    int kontostand;

    public Konto(String inhaber, int kontostand) {
        this.inhaber = inhaber;
        this.kontostand = kontostand;
    }

    public String getInhaber() {
        return inhaber;
    }

    public void setInhaber(String inhaber) {
        this.inhaber = inhaber;
    }

    public int getKontostand() {
        return kontostand;
    }

    public void setKontostand(int kontostand) {
        this.kontostand = kontostand;
    }
}
