public class Main {
    public static void main(String[] args) {
        // Drei Karten:
        Karte k1 = new Karte(Karte.FARBE.ROT, 7);
        Karte k2 = new Karte(Karte.FARBE.SCHWARZ, 8);
        Karte k3 = new Karte(Karte.FARBE.ROT, 9);

        if(k2.kannGelegtWerdenAuf(k1)) {
            System.out.printf("%s kann auf %s gelegt werden.\n", k2.toString(), k1.toString());
        } else {
            System.out.printf("%s kann nicht auf %s gelegt werden.\n", k2.toString(), k1.toString());
        }

        if(k3.kannGelegtWerdenAuf(k1)) {
            System.out.printf("%s kann auf %s gelegt werden.\n", k3.toString(), k1.toString());
        } else {
            System.out.printf("%s kann nicht auf %s gelegt werden.\n", k3.toString(), k1.toString());
        }
    }
}