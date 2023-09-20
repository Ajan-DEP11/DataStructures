import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo4 {
    public static void main(String[] args) {

        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Nuwan");
        names1.add("Amal");
        names1.add("Amal");
        names1.add("Amal");
        System.out.println(names1);
        Collections.fill(names1, "Kasun");
        System.out.println(names1);

        ArrayList<String> names2 = new ArrayList<>(0);
        System.out.println(names2);
        System.out.println(names2.size());
    }
}
