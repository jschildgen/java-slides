import java.math.BigDecimal;

public class Konto {
    private long kontonr;
    private BigDecimal kontostand = BigDecimal.ZERO;

    private static long next_kontonr = 555555L;
    public static final String WAEHRUNG = "EUR";

    public Konto() {
        kontonr = next_kontonr;
        next_kontonr++;
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

    public void auszahlen(BigDecimal d) {
        this.kontostand = this.kontostand.subtract(d);
    }
}
