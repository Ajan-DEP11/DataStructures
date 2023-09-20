import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteDemo1 {
    public static void main(String[] args) throws FileNotFoundException {
        File fileRef = new File("/home/ajan/Desktop/newfile.txt");
        try{
            fileRef.createNewFile();
        }catch (IOException e){
            System.out.println("Failed");
            e.printStackTrace();
            return;
        }
        FileOutputStream fos  = new FileOutputStream(fileRef);
        try{
            String something = "Hello this is my first document";
            byte[] bytes =something.getBytes();
            for(byte b : bytes){
                fos.write(b);
            }
            fos.close();
        }catch (IOException e){
            System.out.println("Failed to write the process");
            e.printStackTrace();
        }
    }
}
