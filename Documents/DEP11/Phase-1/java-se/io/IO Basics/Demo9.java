import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Demo9 {
    public static void main(String[] args)throws Exception {

        String message = "........Ajan Eshwara dep11 software content write here..................";
        File file = new File("readme.txt");

        FileOutputStream fos = new FileOutputStream(file, true); // append true
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        try{
            bos.write(message.getBytes());
            System.out.println("write done");

        }finally{
            bos.close();
        }
    }
}
