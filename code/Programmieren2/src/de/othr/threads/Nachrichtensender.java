package de.othr.threads;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Nachrichtensender {
    Queue<String> nachrichten = new LinkedList<>();

    public static void main(String[] args) {
        Nachrichtensender news = new Nachrichtensender();

        new Thread(() -> { // dieser Thread sendet Nachrichten
            Scanner scan = new Scanner(System.in);
            String nachricht;
            while(!(nachricht = scan.nextLine()).isEmpty()) {
                news.add(nachricht);
            }
        }).start();
        // Im Main-Thread werden die Nachrichten ausgegeben
        news.warten_und_ausgeben();
    }
    //...

    /**
     * Fügt eine neue Neuigkeit in die Warteschlange
     * und benachricht einen auf die Warteschlange
     * wartenden Thread
     * @param neuigkeit Die Nachricht die gesendet werden soll
     */
    public synchronized void add(String neuigkeit) {
        nachrichten.offer(neuigkeit);
        notify();
    }

    public synchronized void warten_und_ausgeben() {
        try {
            while (true) {
                while (nachrichten.isEmpty()) {
                    wait();
                }
                System.out.println(nachrichten.poll());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
