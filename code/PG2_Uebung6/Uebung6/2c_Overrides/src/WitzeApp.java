public class WitzeApp {
    private static WitzAPI api;

    public static void main(String[] args) {
        Witz witz;

        witz = new FrageAntwortWitz("Wie heisst ein Ritter ohne Ruestung?", "Wilhelm");

        System.out.println(witz.getWitz());
    }
}
