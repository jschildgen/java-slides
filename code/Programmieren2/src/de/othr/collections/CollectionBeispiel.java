package de.othr.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class CollectionBeispiel {

    public static void main(String[] args) {
        Integer[] ein_array = {5, 27, -3};


        List<Integer> eine_liste = new ArrayList();
        eine_liste.add(22);

        Arrays.asList(ein_array).forEach(n -> System.out.println(n));


        System.out.println("Hallo!");


        

    }
}
