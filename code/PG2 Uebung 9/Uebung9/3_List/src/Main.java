import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Character> buchstaben = new ArrayList<>();
        buchstaben.add('B');
        buchstaben.add('C');

        buchstaben.add('D');
        buchstaben.add(0, 'A');
        System.out.println(buchstaben.size());
        System.out.println(buchstaben.get(buchstaben.size()-1));

        for(Character c : buchstaben) {
            System.out.println(c);
        }
    }
}