package de.othr.grundlagen;

public class EnumBeispiel {
    enum FARBE { SCHWARZ, ROT };
    public static void main(String[] args) {
        FARBE farbe = FARBE.ROT;
        if(farbe == FARBE.ROT) {
           System.out.println("Die Farbe ist rot!");
        }

        switch(farbe) {
           case ROT: System.out.println("Die Farbe ist rot!"); break;
           default: System.out.println("Keine Ahnung!"); break;
        }

        System.out.println("Die Farbe ist "+
                (farbe==FARBE.ROT ? "rot" : "schwarz")+"!");
    }
}
