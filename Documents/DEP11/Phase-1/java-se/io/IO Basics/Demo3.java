import java.io.File;
import java.io.FileInputStream;

public class Demo3 {

    public static void main(String[] args) {
       File file = new File("readme.txt");
       if(!file.exists())throw new RuntimeException("File not found");

      try{ 
        long t1 = System.nanoTime(); //time stamp / System.currentTimeMillis()
        
        FileInputStream fileInputStream = new FileInputStream(file);

       try{
           byte[] buffer = new byte[fileInputStream.available()]; //fid.readAllBytes --> for small filles. to read all at once
           fileInputStream.read(buffer);
           System.out.println(new String(buffer));
                
               
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
    

