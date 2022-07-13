package com.company;

import java.util.function.Consumer;

public class NMalHalloSager implements Consumer<Integer> {

    @Override
    public void accept(Integer x) {
        for(int i = 0; i < x; i++) {
            System.out.println("Hallo");
        }
    }
}
