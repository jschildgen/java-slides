public class ComputerGegner extends Spieler {
    private int staerke = 2;

    public ComputerGegner() {
        setName("Computer");
    }

    public int getStaerke() {
        return staerke;
    }

    public void setStaerke(int staerke) {
        this.staerke = staerke;
    }

    @Override
    public String getName() {
        return super.getName()+" (Staerke "+this.staerke+")";
    }
}
