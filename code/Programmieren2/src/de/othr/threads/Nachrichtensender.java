package de.othr.threads;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Nachrichtensender {
    Queue<String> nachrichten = new LinkedList<>();

    public static void main(String[] args) {
        Nachrichtensender news = new Nachrichtensender();

        new Thread(() -> {
            Scanner scan = new Scanner(System.in);
            String nachricht;
            while(!(nachricht = scan.nextLine()).isEmpty()) {
                news.add(nachricht);
            }
        }).start();

        news.warten_und_ausgeben();
    }

    private synchronized void add(String neuigkeit) {
        nachrichten.offer(neuigkeit);
        notify();
    }

    private synchronized void warten_und_ausgeben() {
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
