import java.math.BigDecimal;

public class Konto {
    private long kontonr;
    private BigDecimal kontostand    ;




    public Konto() {

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
