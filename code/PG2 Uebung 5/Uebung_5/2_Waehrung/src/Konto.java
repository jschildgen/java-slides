import java.math.BigDecimal;

public class Konto {
    public static final String WAEHRUNG = "EUR";

    private long kontonr;
    private BigDecimal kontostand;

    public Konto(long kontonr) {
        this.kontonr = kontonr;
    }

    public long getKontonr() {
        return kontonr;
    }

    public BigDecimal getKontostand() {
        return kontostand;
    }

    public void einzahlen(BigDecimal d) {
        this.kontostand = this.kontostand.add(d);
    }
}