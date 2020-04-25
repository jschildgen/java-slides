import java.math.BigDecimal;

public class Bank {
    public static void main(String[] args) {
        Konto k1 = new Konto();
        Konto k2 = new Konto();
        Bank.ueberweisen(k1, k2, new BigDecimal("29.9"));
        System.out.printf("Konto %d: %.2f %s\n", k1.getKontonr(), k1.getKontostand(), Konto.WAEHRUNG);
        System.out.printf("Konto %d: %.2f %s\n", k2.getKontonr(), k2.getKontostand(), Konto.WAEHRUNG);
    }

    public static void ueberweisen(Konto k1, Konto k2, BigDecimal betrag) {
        k1.auszahlen(betrag);
        k2.einzahlen(betrag);
    }
}