import java.math.BigDecimal;

public class Bank {
    public static void main(String[] args) {
        Konto konto = new Konto();
        konto.einzahlen(new BigDecimal("185.25"));
        konto.auszahlen(new BigDecimal("80.01"));
        System.out.println("Kontostand: "+konto.getKontostand());
    }
}