import java.math.BigDecimal;

public class Konto {
    private long kontonr;
    private BigDecimal kontostand;

    private static long next_kontonummer = 555555L;

    public Konto() {
        kontonr = next_kontonummer;
        next_kontonummer++;
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
