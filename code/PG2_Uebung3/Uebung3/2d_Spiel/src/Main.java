public class Main {
    public static void main(String[] args) {
        Karte k1 = new Karte(Karte.FARBE.ROT, 10);
        Karte k2;
        do {
            k2 = new Karte();
        } while(!k2.kannGelegtWerdenAuf(k1));
        System.out.println("Na endlich!");
    }
}