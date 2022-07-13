public class Main {
    public static void main(String[] args) {
        // Ich erzeuge mir eine rote Sieben
        Karte k1 = new Karte();
        k1.setFarbe(Karte.FARBE.ROT);
        k1.setWert(7);

        System.out.printf("Farbe: %s\nWert: %d\n",
                k1.getFarbe(), k1.getWert());

        // Ich erzeuge mir eine schwarze Acht
        Karte k2 = new Karte(Karte.FARBE.SCHWARZ, 8);

        System.out.printf("Farbe: %s\nWert: %d\n",
                k2.getFarbe(), k2.getWert());
    }
}