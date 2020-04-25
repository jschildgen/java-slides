import java.util.Random;

public class Wuerfeln {
    public static void main(String[] args) {
        Random wuerfel = new Random();

        int augenzahl = wuerfel.nextInt(6) + 1;

        System.out.println("Ich habe eine "+augenzahl+" gewuerfelt.");
    }
}