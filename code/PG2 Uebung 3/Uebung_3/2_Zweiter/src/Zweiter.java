import java.util.Arrays;
import java.util.Scanner;

public class Zweiter {
    public static void main(String[] args) {
        final int N = 7;

        Integer[] min = new Integer[2];   // 1 4    0
        Integer[] max = new Integer[2];   // 9 10

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 7; i++) {
            System.out.printf("%d. Zahl: ", i+1);
            int zahl = Integer.parseInt(scanner.nextLine());

            if(min[0] == null || min[0] > zahl) {  // zahl: kleinste
                min[1] = min[0];
                min[0] = zahl;
            } else if(min[1] == null || min[1] > zahl) {         // zahl: zweitkleinste
                min[1] = zahl;
            }

            if(max[0] == null || max[0] < zahl) {  // zahl: groesste
                max[1] = max[0];
                max[0] = zahl;
            } else if(max[1] == null || max[1] < zahl) {          // zahl: zweitgroesste
                max[1] = zahl;
            }
        }
        System.out.printf("Zweitkleinste: %d\n", min[1]);
        System.out.printf("Zweitgroesste: %d\n", max[1]);
    }
}