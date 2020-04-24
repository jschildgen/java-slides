package de.othr.interfaces;

public interface Printable {
    void print();

    default void printTwice() {
        print();
        print();
    }
}
