public class MauMau {
    public static void main(String[] args) {
        Spieler[] spieler =
                { new ComputerGegner(),
                  new ComputerGegner() };

        int anzahl_menschen = 0;
        int anzahl_computer = 0;

        for(Spieler s : spieler) {
            if(s instanceof MenschlicherSpieler) {
                anzahl_menschen++;
            } else if (s instanceof ComputerGegner) {
                anzahl_computer++;
            }
            System.out.println(s.getName());
        }

        System.out.println("Anzahl Menschen: "+anzahl_menschen);
        System.out.println("Anzahl Computer: "+anzahl_computer);
    }
}