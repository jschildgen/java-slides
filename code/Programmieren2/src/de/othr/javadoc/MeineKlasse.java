package de.othr.javadoc;

public class MeineKlasse {
    /**
     * Die Methode nimmt eine Zahl n entgegen und
     * gibt ebensooft Hallo aus.
     * @param n Die Anzahl der Hallos
     * @throws IllegalArgumentException wenn n negativ ist
     */
    public static void nMalHallo(int n) {
        // ...
        if(n < 0) {
            throw new IllegalArgumentException("n darf nicht negativ sein");
        }
        for(int i = 1; i<=n; i++) {
            System.out.println("Hallo");
        }
    }

    public static void main(String[] args) {
        MeineKlasse.nMalHallo(1);
    }
}













