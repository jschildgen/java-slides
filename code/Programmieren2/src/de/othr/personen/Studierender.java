package de.othr.personen;

public class Studierender extends Person {
    private int matrikelnr;

    public Studierender(String name) {
        super(name);
    }

    public Studierender(String name, int matrikelnr) {
        super(name);
        this.matrikelnr = matrikelnr;
    }

    public int getMatrikelnr() {
        return matrikelnr;
    }

    public void setMatrikelnr(int matrikelnr) {
        this.matrikelnr = matrikelnr;
    }
}
