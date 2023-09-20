import java.io.Serializable;

public class Customer implements Serializable{
    int id;
    String Name;
   transient String Address;
    // String Contact;

    private static final long serialVersionUID = -8576590183751386833L;

    public Customer(int id, String Name,String Address){
        this.id =id;
        this.Name =Name;
        this.Address = Address;
        this.Contact = Contact;
    }

    // public Customer(int id, String Name,String Address,String Contact){
    //     this.id =id;
    //     this.Name =Name;
    //     this.Address = Address;
    //     this.Contact = Contact;
    // }

    
}
