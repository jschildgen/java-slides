package de.othr.threads;

public class TimerApp {
    public static void main(String[] args) {
        Timer t1 = new Timer("Spaghetti", 8);
        Timer t2 = new Timer("Sosse", 15);

        t1.start();
        t2.start();

        try {
            do {
                System.out.println(t1.getState());
                Thread.sleep(1000);
            } while (t1.getState() != Thread.State.TERMINATED);
        } catch (InterruptedException e) { }
    }
}
