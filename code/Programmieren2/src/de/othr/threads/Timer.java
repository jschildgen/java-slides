package de.othr.threads;

public class Timer extends Thread {
    private String bezeichnung;
    private int sekunden;

    public Timer(String bezeichnung, int sekunden) {
        this.bezeichnung = bezeichnung;
        this.sekunden = sekunden;
    }
    // ...
    @Override
    public void run() {
        System.out.println(bezeichnung+"-Timer gestartet.");
        try {
            Thread.sleep(sekunden*1000);
        } catch (InterruptedException e) {
            System.out.println(bezeichnung+"-Timer unterbrochen.");
        }
        System.out.println(bezeichnung+"-Timer abgelaufen.");
        // ...
    }
}
