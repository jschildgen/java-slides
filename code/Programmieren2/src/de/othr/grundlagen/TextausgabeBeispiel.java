package de.othr.grundlagen;

public class TextausgabeBeispiel {
    public static void main(String[] args) {
        System.out.println("Hallo\nNeue Zeile\nNochmal hallo!");
        System.out.print("Fünf plus fünf ist ");
        System.out.println(5+5);

        System.out.printf("%s ist %d Jahre alt und Pi ist %.4f",
                "Peter", 20, Math.PI);
    }
}
