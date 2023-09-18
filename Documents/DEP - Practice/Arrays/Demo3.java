import java.util.Arrays;
import java.util.Scanner;

public class Demo3 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String[] name = new String[3];

        for(int i =0;i<name.length;i++){
            System.out.print("Enter your Name: ");
            name[i] = scanner.nextLine();

        }
        System.out.println(Arrays.toString(name));
        System.out.println(name[2]);
    }
}
