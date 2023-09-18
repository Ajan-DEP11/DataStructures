import java.util.Arrays;
import java.util.Scanner;

public class Demo4 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] myArray = new int[7];
        int size = 5;


            for(int i=0;i<size;i++){
            System.out.print("Enter a number: ");
            myArray[i] = scanner.nextInt();
            //
        
        }
        size++;
        System.out.println(Arrays.toString(myArray));

        System.out.print("Enter the index; ");
        int index = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the Element: ");
        int element = scanner.nextInt();
        scanner.nextLine();

        for(int k= index; k<size;k++){
            myArray[k] = myArray[k-1];

        }
        myArray[index] = element;
        System.out.println(Arrays.toString(myArray));

        
        
    }
}
