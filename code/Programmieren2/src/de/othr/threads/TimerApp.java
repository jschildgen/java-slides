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

        main2(args); main3(args);
    }

    private static void main2(String[] args) {
        new Thread() {
            @Override
            public void run() {
                System.out.println("Hallo!");
            }
        }.start();
    }

    private static void main3(String[] args) {
        new Thread(() -> {
            System.out.println("Pizza-Timer gestartet.");
            try {
                Thread.sleep(15*1000);
            } catch (InterruptedException e) {
                System.out.println("Pizza-Timer unterbrochen.");
            }
            System.out.println("Pizza-Timer abgelaufen.");
        }).start();
    }
}
