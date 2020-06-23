package de.othr.threads;

import java.util.ArrayList;
import java.util.List;

public class GeldbeutelSync {

    public static void main(String[] args) {
        List<Integer> geldbeutel
                = new ArrayList<>();
        new Thread(() -> {
          try {
            synchronized (geldbeutel) {
              for (int i = 1; i <= 100; i++) {
                geldbeutel.add(5);
                Thread.sleep(1);
              }
            }
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }).start();

        try {
          Thread.sleep(1);
          synchronized (geldbeutel) {
            System.out.println(
              geldbeutel.stream()
                .reduce((x, y) -> x+y)
                .get());
          }
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
    }
}
