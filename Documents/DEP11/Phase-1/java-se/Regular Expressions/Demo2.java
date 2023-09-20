import java.util.Scanner;

public class Demo2 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter your Contact Number: ");
        String contact = scanner.nextLine().strip();
        //077-1234567 +9477-1234567

        if(contact.startsWith("0")){
            for(int i=0; i<3;i++){
                if(!Character.isDigit(contact.charAt(i))){
                    System.out.println("Invalid contact number");
                    return;
                }

            }
        }
        
    }
    
}
