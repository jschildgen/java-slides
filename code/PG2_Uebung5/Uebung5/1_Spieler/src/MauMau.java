public class MauMau {
    public static void main(String[] args) {
        Spieler[] spieler =
                { new MenschlicherSpieler(),
                  new ComputerGegner() };

        for(Spieler s : spieler) {
            System.out.println(s.getName());
        }
    }
}