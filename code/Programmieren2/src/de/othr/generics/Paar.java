package de.othr.generics;

public class Paar<T> {
    private T erster;
    private T zweiter;

    public Paar(T erster, T zweiter) {
        this.erster = erster;
        this.zweiter = zweiter;
    }

    public T getErster() {
        return erster;
    }

    public void setErster(T erster) {
        this.erster = erster;
    }

    // ...
    public T getZweiter() {
        return zweiter;
    }

    public void setZweiter(T zweiter) {
        this.zweiter = zweiter;
    }
}
