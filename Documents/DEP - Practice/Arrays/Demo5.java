import java.util.Arrays;
import java.util.Scanner;

public class Demo5 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] myArray = new int[4];

        int size = 5;

        for(int i=0;i<size;i++){
            System.out.print("Enter the number; ");
            myArray[i] = scanner.nextInt();

        }
       
        System.out.println(Arrays.toString(myArray));

        System.out.print("enter the index: ");
        int index= scanner.nextInt();
        scanner.nextLine();

        /*System.out.println("Enter the Elemet: ");
        int element = scanner.nextInt();
        scanner.nextInt();*/

        for(int j=index; j<size;j++){
            myArray[j] = myArray[j+1];

        }
        size--;
        System.out.println(Arrays.toString(myArray));
       

        
    }
}
