import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

public class Demo2 {

     public static void main(String[] args) {
       File file = new File("readme.txt");
       if(!file.exists())throw new RuntimeException("File not found");

      try{ 
        long t1 = System.nanoTime(); //time stamp / System.currentTimeMillis()
        
        FileInputStream fileInputStream = new FileInputStream(file);

       try{
            int read = -1;
            byte[] buffer = new byte[1024*5]; //1kb ---> chunk

            while((read = fileInputStream.read(buffer))!= -1){
                //System.out.println(Arrays.toString(buffer));
                //System.out.println(new String(buffer));
                System.out.println(new String(buffer,0,read));
                
               
            }
            long t2 = System.nanoTime();
            System.out.println("Time : "+(t2 - t1));


       }finally{
        fileInputStream.close();
       }
    }catch(Throwable e){
        e.printStackTrace();
       }
    }
    
}
