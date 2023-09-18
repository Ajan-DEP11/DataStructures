import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        ArrayList<String> arrayList = new ArrayList<>();

        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);

        System.out.println(vector);

        vector.remove(0);
        System.out.println(vector);
        System.out.println("=========================");

        arrayList.add("Ajan");
        arrayList.add("kasun");
        arrayList.add("Nimal");

        System.out.println(arrayList);

        arrayList.remove(0);
        arrayList.remove("Ajan");

        System.out.println(arrayList);

        arrayList.remove(1);
        System.out.println(arrayList);

        System.out.println("==============================");

        // vector.remove(4);
        // System.out.println(vector);

        vector.clear();
        System.out.println(vector);
        arrayList.clear();
        System.out.println("=================================");
        System.out.println(arrayList);

    }
}
