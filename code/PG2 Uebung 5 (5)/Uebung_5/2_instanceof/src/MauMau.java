import javax.security.sasl.SaslServer;

public class MauMau {
    public static void main(String[] args) {
        Spieler[] spieler =
                { new ComputerGegner(),
                        new ComputerGegner() };

        int[] anzahl = new int[2];

        for(Spieler s : spieler) {
            if(s instanceof MenschlicherSpieler) {
                anzahl[0]++;
            } else if(s instanceof ComputerGegner) {
                anzahl[1]++;
            }
            System.out.println(s.getName());
        }

        System.out.printf("Anzahl Menschen: %d\n", anzahl[0]);
        System.out.printf("Anzahl Computer: %d\n", anzahl[1]);
    }
}