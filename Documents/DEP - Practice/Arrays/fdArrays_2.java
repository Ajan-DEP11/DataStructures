import java.util.Arrays;
import java.util.Scanner;

public class fdArrays_2 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int [] myArray = new int[5];

        for(int i=0;i<myArray.length; i++){
            System.out.print("Enter a number to continue: ");
            myArray[i] =scanner.nextInt();
            
            
        }
        System.out.println(Arrays.toString(myArray));
           
        
        
    }
}
