package de.othr.threads;

public class ABCTest {
    public static void main(String[] args) {
        ABC abc = new ABC();
        new Thread() {
            @Override
            public void run() {
                abc.print();
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                abc.print();
            }
        }.start();
    }
}
