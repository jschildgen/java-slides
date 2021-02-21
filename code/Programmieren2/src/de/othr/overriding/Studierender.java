package de.othr.overriding;

public class Studierender extends Person {
    private int matrikelnr;

    public Studierender(String name, int matrikelnr) {
        super(name);
        this.matrikelnr = matrikelnr;
    }

    public int getMatrikelnr() {
        return matrikelnr;
    }

    @Override
    public String getDetails() {
        return ""+this.matrikelnr+" / "
                +super.getDetails();
    }
}
