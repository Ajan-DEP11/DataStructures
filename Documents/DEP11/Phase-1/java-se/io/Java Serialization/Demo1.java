import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Demo1 {
    public static void main(String[] args) throws IOException{
        Customer customer1 = new Customer(1, "Kasun", "Matale");
        Customer customer2 = new Customer(2, "Nadun", "Matale");


        File file = new File("customer.dep");
        file.createNewFile();
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        try{
            oos.writeObject(customer1);
            oos.writeObject(customer2);



        }finally{
            oos.close();
        }

        
    }
}

// class Customer implements Serializable{ //serializing this instance to converte to byte *this class is eligeble to java serializ;
//     int id;
//     String Name;
//     String Address;

//     public Customer(int id, String Name,String Address){
//         this.id =id;
//         this.Name =Name;
//         this.Address = Address;
//     }
// }