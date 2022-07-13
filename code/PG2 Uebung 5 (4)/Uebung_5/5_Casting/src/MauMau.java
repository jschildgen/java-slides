public class MauMau {
    public static void main(String[] args) {
        Spieler[] spieler =
                { new ComputerGegner(),
                        new ComputerGegner() };

        ComputerGegner c = (ComputerGegner) spieler[0];
        c.setStaerke(3);

        for(Spieler s : spieler) {
            System.out.println(s.getName());
        }
    }
}