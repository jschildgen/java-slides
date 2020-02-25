package de.othr.personen;

public class Haustier {
    public static final String TIERART = "Hund";
    public static String farbe;
    private String name;

    public Haustier(String name) { this.name = name; }

    public static void main(String[] args) {
        System.out.println("Jedes Haustier ist ein "
            +Haustier.TIERART);
        Haustier w = new Haustier("Waldi");
        Haustier f = new Haustier("Fiffi");
        w.farbe = "schwarz";
        System.out.println("Fiffi ist auch "+f.farbe);
    }
}
