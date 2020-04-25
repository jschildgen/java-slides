import java.util.Scanner;

public class Hallo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Wie heißt du? ");
        String name = scan.nextLine();

        System.out.printf("Hallo %s!\n", name);
    }
}