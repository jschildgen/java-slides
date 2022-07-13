import java.util.Scanner;

public class MenschlicherSpieler extends Spieler {
    private static final Scanner SCAN = new Scanner(System.in);

    public MenschlicherSpieler(String name) {
        setName(name);
    }

    public MenschlicherSpieler() {
        System.out.print("Wie ist dein Name? ");
        setName(SCAN.nextLine());
    }
}
