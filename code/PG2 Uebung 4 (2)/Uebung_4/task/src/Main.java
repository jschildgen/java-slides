public class Main {
    public static void main(String[] args) {
        // Ich erzeuge mir eine rote Sieben
        Karte k1 = new Karte();
        k1.setFarbe(Karte.FARBE.ROT);
        k1.setWert(7);

        System.out.println(k1.toString());
    }
}