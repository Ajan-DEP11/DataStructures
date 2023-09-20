import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadDemo1 {
    public static void main(String[] args) throws FileNotFoundException {
        File fileRef = new File("/home/ajan/Desktop/something.txt");
        FileInputStream fis = new FileInputStream(fileRef);


        try {
            int readByte = 0;
            int totalByte =0;

           while (readByte != -1){
                readByte = fis.read();
                totalByte++;
               System.out.print((char) readByte);

            }
            System.out.println("total byte read :" +(totalByte-1));


            fis.close();
        } catch (IOException e) {
            System.out.println("Fail to complete the reading process");
            e.printStackTrace();
        }
    }
}
