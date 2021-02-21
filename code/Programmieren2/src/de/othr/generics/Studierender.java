package de.othr.generics;

public class Studierender extends Person {
    private int matrikelnr;

    public Studierender(String name, int matrikelnr) {
        super(name);
        this.matrikelnr = matrikelnr;
    }

    public int getMatrikelnr() {
        return matrikelnr;
    }
}
