public class Tiere {
   public static void main(String[] args) {
      String[] tiere = new String[3];

      tiere[0] = "Hund";
      tiere[1] = "Katze";
      tiere[2] = "Maus";

      for(int i = 0; i < tiere.length; i++) {
         System.out.println(tiere[i]);
      }

      for(String tier : tiere) {
         System.out.println(tier);
      }
   }
}