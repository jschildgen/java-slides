package de.othr.generics;

public class StringPaar {
    private String erster;
    private String zweiter;

    public StringPaar(String erster, String zweiter) {
        this.erster = erster;
        this.zweiter = zweiter;
    }

    public String getErster() {
        return erster;
    }

    public void setErster(String erster) {
        this.erster = erster;
    }

    // ...
    public String getZweiter() {
        return zweiter;
    }

    public void setZweiter(String zweiter) {
        this.zweiter = zweiter;
    }
}
