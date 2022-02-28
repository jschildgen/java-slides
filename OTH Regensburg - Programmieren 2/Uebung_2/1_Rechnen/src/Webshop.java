public class Webshop {
   public static void main(String[] args) {
      int anzahl = 10;
      double preis = 1.39;
      double versandkosten = 4.99;
      double gesamtpreis = anzahl*preis + versandkosten;
      System.out.println("Gesamtpreis: "+gesamtpreis);
   }
}