public class MauMau {
    public static void main(String[] args) {
        Spieler[] spieler =
                { new ComputerGegner(),
                        new ComputerGegner() };

        /* TODO */

        for(Spieler s : spieler) {
            System.out.println(s.getName());
        }
    }
}