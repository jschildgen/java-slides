package com.company;

public class Studierender extends Person {
    private int matrikelnr;

    public Studierender(String name, int matrikelnr) {
        super(name);
        this.matrikelnr = matrikelnr;
    }

    public int getMatrikelnr() {
        return matrikelnr;
    }

    public final String getDetails() {
        return ""+this.matrikelnr;
    }

    @Override
    public String toString() {
        return getDetails();
    }
}