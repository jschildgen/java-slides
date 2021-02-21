package de.othr.threads;

public class ABC {
    public void print() {
        try {
            System.out.print("A");
            Thread.sleep(10);
            System.out.print("B");
            Thread.sleep(10);
            System.out.print("C");
        } catch (InterruptedException e) { e.printStackTrace(); }
    }

    public synchronized void sync_print() {
        try {
            System.out.print("A");
            Thread.sleep(10);
            System.out.print("B");
            Thread.sleep(10);
            System.out.print("C");
        } catch (InterruptedException e) { e.printStackTrace(); }
    }
}
