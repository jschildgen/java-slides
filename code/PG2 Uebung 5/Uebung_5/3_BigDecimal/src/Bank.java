public class Bank {
    public static void main(String[] args) {
        Konto konto = new Konto(12345);
        System.out.println("Kontostand: "+konto.getKontostand());
    }
}