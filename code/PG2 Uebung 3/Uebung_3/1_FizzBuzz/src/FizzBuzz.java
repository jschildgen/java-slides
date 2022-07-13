public class FizzBuzz {
    public static void main(String[] args) {
        final int N = 100;

        for(int i = 1; i <= 100; i++) {
            String zahl = "";
            if(i % 3 == 0) { zahl += "Fizz"; }
            if(i % 5 == 0) { zahl += "Buzz"; }
            if(i % 3 != 0 && i % 5 != 0) { zahl = ""+i; }

            System.out.print(zahl+
                    (i==N ? "" : ", "));
        }
    }
}