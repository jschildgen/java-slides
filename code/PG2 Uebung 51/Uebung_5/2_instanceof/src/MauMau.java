import javax.security.sasl.SaslServer;

public class MauMau {
    public static void main(String[] args) {
        Spieler[] spieler =
                { new ComputerGegner(),
                        new ComputerGegner() };

        /* TODO */        for(Spieler s : spieler) {
            /* TODO */
            System.out.println(s.getName());
        }

        /* TODO */
    }
}