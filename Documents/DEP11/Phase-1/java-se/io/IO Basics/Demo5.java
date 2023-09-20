import java.io.File;
import java.io.FileOutputStream;

public class Demo5 {
    public static void main(String[] args) {
        String message = "Input output basics 123446";

try {
        File file = new File("readme.txt");
        if(!file.exists())file.createNewFile();

        byte[] bytes = message.getBytes();
        FileOutputStream fos = new FileOutputStream(file);

        try {
            for(byte b: bytes){
                fos.write(b);
            }
        }finally{
            fos.close();
        }






    }catch(Throwable e){
        e.printStackTrace();
    }

}

}