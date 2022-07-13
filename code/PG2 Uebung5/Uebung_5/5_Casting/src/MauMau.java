public class MauMau {
    public static void main(String[] args) {
        Spieler[] spieler =
                { new ComputerGegner(),
                        new ComputerGegner() };

        ((ComputerGegner)spieler[0]).setStaerke(3);

        for(Spieler s : spieler) {
            System.out.println(s.getName());
        }
    }
}