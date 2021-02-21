package de.othr.threads;

public class ABCTest {
    public static void main(String[] args) {
        ABC abc = new ABC();
        new Thread(() -> abc.print()).start();
        new Thread(() -> abc.print()).start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) { e.printStackTrace(); }
        System.out.println();
        new Thread(() -> abc.sync_print()).start();
        new Thread(() -> abc.sync_print()).start();
    }
}
