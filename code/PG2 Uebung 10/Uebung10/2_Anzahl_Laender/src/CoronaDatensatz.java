import java.time.LocalDate;

public class CoronaDatensatz {
    private LocalDate datum;
    private int faelle;
    private String land;
    private String kontinent;

    public CoronaDatensatz(LocalDate datum, int faelle, String land, String kontinent) {
        this.datum = datum;
        this.faelle = faelle;
        this.land = land;
        this.kontinent = kontinent;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public int getFaelle() {
        return faelle;
    }

    public void setFaelle(int faelle) {
        this.faelle = faelle;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public String getKontinent() {
        return kontinent;
    }

    public void setKontinent(String kontinent) {
        this.kontinent = kontinent;
    }
}
