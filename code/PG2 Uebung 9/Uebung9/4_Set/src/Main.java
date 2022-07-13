import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> zahlen = new TreeSet<>();
        zahlen.add(27);
        zahlen.add(14);

        zahlen.add(77);
        zahlen.add(77);

        System.out.println(zahlen.size());
        if(zahlen.contains(14)) {
            System.out.println("Jepp");
        }

        for(Integer zahl : zahlen) {
            System.out.println(zahl);
        }
    }
}