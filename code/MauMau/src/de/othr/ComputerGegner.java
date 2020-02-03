package de.othr;

public class ComputerGegner extends Spieler {
    public ComputerGegner() {
        setName("Computer");
    }

    @Override
    public Karte legeKarte(Karte aktuelleKarte) {
        for(int i = 0; i<karten.size(); i++) {
            if(karten.get(i).kannGelegtWerdenAuf(aktuelleKarte)) {
                return karten.get(i);
            }
        }
        return null;
    }
}
