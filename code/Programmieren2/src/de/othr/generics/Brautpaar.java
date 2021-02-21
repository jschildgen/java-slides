package de.othr.generics;

public class Brautpaar<T extends Person> {
    private T erster;
    private T zweiter;

    public Brautpaar(T erster, T zweiter) {
        if(erster.getAlter() < 18
        || zweiter.getAlter() < 18) {
            throw new IllegalArgumentException("Zu jung.");
        }
    }
    //...
}
