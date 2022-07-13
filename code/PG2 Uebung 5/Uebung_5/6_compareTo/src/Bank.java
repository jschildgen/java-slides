import java.math.BigDecimal;

public class Bank {
    public static void main(String[] args) {
        Konto k1 = new Konto(111111);
        Konto k2 = new Konto(222222);
        k1.einzahlen(new BigDecimal("100"));
        k2.einzahlen(new BigDecimal("100.00"));
        if(k1.getKontostand().compareTo(k2.getKontostand()) == 0) {
            System.out.println("Auf beiden Konten ist gleich viel Geld.");
        }
    }


}