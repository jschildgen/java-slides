package de.othr.grundlagen;

import java.util.Arrays;

public class ArrayBeispiel {
    public static void main(String[] args) {
        {
            int[] lotto = new int[6];
            lotto[0] = 17;
            lotto[1] = 28;
            lotto[2] = 32;
            lotto[3] = 4;
            lotto[4] = 29;
            lotto[5] = 43;

            String[] tage = {"So", "Mo", "Di", "Mi", "Do", "Fr", "Sa"};

            System.out.println("Es gibt " + tage.length + " Wochentage");
            System.out.println("Erster Tag: " + tage[0]);
            System.out.println("Letzter Tag: " + tage[6]);

            for (int i = 0; i < tage.length; i++) {
                System.out.println("Wochentag " + i + " ist der " + tage[i]);
            }

            for (String tag : tage) {
                System.out.println(tag);
            }

            for (int zahl : lotto) {
                System.out.println(zahl);
            }
        }

        int[] lotto = {17, 28, 32, 4, 29, 43};
        System.out.println(lotto);   // [I@6d311334
        System.out.println(Arrays.toString(lotto));

        int[] lotto2 = lotto.clone();
        Arrays.sort(lotto2);
        System.out.println(Arrays.toString(lotto2));
    }
}
