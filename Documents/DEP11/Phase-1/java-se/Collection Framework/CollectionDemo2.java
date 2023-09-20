import java.util.ArrayList;
import java.util.Collections;

public class CollectionDemo2 {
    public static void main(String[] args) {

         
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(11);
        numbers.add(203);
        numbers.add(30);
        numbers.add(4);
        numbers.add(-3);

         ArrayList<String> names = new ArrayList<>();
         names.add("Kasun");
         names.add("Ruwan");
         names.add("juamal");
         names.add("Nadun");
         names.add("Ajan");

         System.out.println(numbers);
         System.out.println(names);

         Collections.sort(names);
         Collections.sort(numbers);

         System.out.println(numbers);
         System.out.println(names);

        
    }
}
