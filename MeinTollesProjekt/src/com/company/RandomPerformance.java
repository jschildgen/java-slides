package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomPerformance {


    public static void main(String[] args) {
        long[] durations = new long[10];

        Random random = new Random();
        for(int j = 0; j < 10; j++) {
            long startTime = System.nanoTime();
            for (long i = 1; i <= 10000000L; i++) {
                //long zufall = random.nextInt(1000) + 1000;        // 159ms
                long zufall = random.nextInt(1000,2000);            // 155ms
            }
            long stopTime = System.nanoTime();
            durations[j] = stopTime-startTime;

            System.out.printf("%,d\n", durations[j]);
        }

        System.out.printf("AVG = %.0f ms", Arrays.stream(durations).average().getAsDouble()/1000/1000);



    }
}
