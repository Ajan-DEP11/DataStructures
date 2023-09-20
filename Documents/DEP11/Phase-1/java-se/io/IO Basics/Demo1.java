import java.io.File;
import java.io.FileInputStream;

public class Demo1 {
    public static void main(String[] args) {
       File file = new File("readme.txt");
       if(!file.exists())throw new RuntimeException("File not found");

      try{ 
        FileInputStream fileInputStream = new FileInputStream(file);

       try{
            int read = -1;

            while((read=fileInputStream.read()!= -1)){

                fileInputStream.read();
            }


       }finally{
        fileInputStream.close();
       }
    }catch(Throwable e){
        e.printStackTrace();
       }
    }
}