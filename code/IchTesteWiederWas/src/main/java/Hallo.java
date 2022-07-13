import org.apache.commons.math3.primes.Primes;

public class Hallo {
    public static void main(String[] args) {
        System.out.println("Hi");
        int n = 37;
        if(Primes.isPrime(n)) {
            System.out.println(""+n+" ist eine Primzahl");
        } else {
            System.out.println(""+n+" ist keine Primzahl");
        }
    }
}
