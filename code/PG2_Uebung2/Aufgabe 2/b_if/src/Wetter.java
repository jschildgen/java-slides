public class Wetter {
   public static void main(String[] args) {
      double temperatur = 1.5;

      for(int tag = 1; tag <= 7; tag++) {
         // Jeden Tag wird es 5 Grad wärmer
         temperatur += 5;

         if(temperatur < 7) {
            System.out.println("Es ist eiskalt!");
         } else if(temperatur < 18) {
            System.out.println("Es ist kalt!");
         } else {
            System.out.println("Es ist warm!");
         }

      }

   }
}