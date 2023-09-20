import java.util.Scanner;

public class Demo {


    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

       while(true){ 
        
        System.out.print("Enter your NIC: ");
        String nic = scanner.nextLine();

        if(nic.length() !=10){
            System.out.println("invalid nic");
            return;
        }

        for(int i =0; i<9; i++){
            if(!Character.isDigit(nic.charAt(i))){
                System.out.println("Inavalid");
                return;
            }
        }

        if(!(nic.endsWith("v") || nic.endsWith("V"))){
            System.out.println("Invalid");
            return;
        }
        System.out.println("valid NIC");
        }
        
    }
}