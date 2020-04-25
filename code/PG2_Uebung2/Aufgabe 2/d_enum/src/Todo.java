public class Todo {

   enum STATUS { OFFEN, IN_ARBEIT, FERTIG };

   public static void main(String[] args) {
      STATUS status = STATUS.OFFEN;
      System.out.println(status);

      // Jetzt fange ich an zu arbeiten
      status = STATUS.IN_ARBEIT;
      System.out.println(status);

      // Jetzt bin ich fertig
      status = STATUS.FERTIG;
      System.out.println(status);
   }
}