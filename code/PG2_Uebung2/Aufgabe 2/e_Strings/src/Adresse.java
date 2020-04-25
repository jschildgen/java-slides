public class Adresse {
   public static void main(String[] args) {
      String strasse = "Haupstrasse";
      String hausnummer = "4b";
      String plz = "01234";
      String ort = new String("Teststadt");

      System.out.println(strasse+" "+hausnummer+" "+plz+" "+ort);

      if("Teststadt".equals(ort)) {
         System.out.println("Die Adresse befindet sich in Teststadt!");
      }
   }
}