import java.util.Scanner;

public class Demo2RegEx {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        while(true){

        System.out.print("Enter your Contact Number: ");
        String contact = scanner.nextLine().strip();
        //077-1234567 +9477-1234567
        if(contact.matches("(0\\d{2}-\\d{7})| ([+]94\\d{2}-\\d{7})")){
            System.out.println("Valid contact");
        }else{
            System.out.println("Inavalid contact");
        }
    }
        
    }
}
