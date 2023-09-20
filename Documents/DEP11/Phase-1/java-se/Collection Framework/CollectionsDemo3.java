import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo3 {
    public static void main(String[] args) {
        
    

     ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.add(100);
        numbers1.add(20);
        numbers1.add(3);
        numbers1.add(80);
        numbers1.add(50);

         ArrayList<String> names1 = new ArrayList<>();
         names1.add("Kasun");
         names1.add("Ruwan");
         names1.add("Kamal");
         names1.add("Nadun");
         names1.add("Kandbjkn");


         Collections.sort(numbers1);
         int index =Collections.binarySearch(numbers1,3);
         System.out.println(index);

         Collections.sort(names1);
         index =Collections.binarySearch(names1,"Ajan");
         System.out.println(index);
         
         
    
}
}
