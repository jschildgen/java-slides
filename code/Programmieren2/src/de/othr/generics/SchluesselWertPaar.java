package de.othr.generics;

public class SchluesselWertPaar<K, V> {
    K schluessel;
    V wert;

    public SchluesselWertPaar(K schluessel, V wert) {
        this.schluessel = schluessel;
        this.wert = wert;
    }

    public K getSchluessel() {
        return schluessel;
    }

    public void setSchluessel(K schluessel) {
        this.schluessel = schluessel;
    }

    public V getWert() {
        return wert;
    }

    public void setWert(V wert) {
        this.wert = wert;
    }

    //...


    @Override
    public String toString() {
        return "("+schluessel.toString()+", "
                  +wert.toString()+")";
    }
}
