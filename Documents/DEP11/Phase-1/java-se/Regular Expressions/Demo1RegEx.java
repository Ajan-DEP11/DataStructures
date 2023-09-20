import java.util.Scanner;

public class Demo1RegEx {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while(true){
        System.out.print("Enter your NIC: ");
        String nic = scanner.nextLine().strip();
       if( nic.matches("\\d{9}[Vv]")){
        System.out.println("valid NIC");
       }else{
        System.out.println("Inavalid NIC");
       }
    }
    }
    
}
