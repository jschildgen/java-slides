package de.othr.threads;

public class ZahlenSumme {
    public static void main(String[] args) {
        Integer[] zahlen = new Integer[100];
        for(int i = 0; i < 100; i++) { zahlen[i] = 1; }

        new Thread() {
            @Override
            public void run() {
                synchronized(zahlen) {
                    for (int a = 0; a <= 1000; a++) {
                        for (int i = 0; i < 100; i++) {
                            zahlen[i]++;
                        }
                    }
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                try {
                    Integer summe = 0;
                    zahlen.wait();
                    for(int i = 0; i < 10; i++) { summe += zahlen[i]; }
                    System.out.println("Summe: "+summe);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
}
