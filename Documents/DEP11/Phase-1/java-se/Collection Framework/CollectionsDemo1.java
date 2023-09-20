import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

         ArrayList<String> names = new ArrayList<>();
         names.add("Kasun");
         names.add("Ruwan");
         names.add("Kamal");
         names.add("Nadun");
         names.add("Kandbjkn");

         System.out.println(names);
         System.out.println(numbers);
         Collections.reverse(numbers);
         Collections.reverse(names);
         System.out.println(names);
         System.out.println(numbers);
         

        
    }
}