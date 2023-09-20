import java.io.File;
import java.io.FileOutputStream;

public class Demo6 {

    public static void main(String[] args) {
        String message = "Input output basics Ajan ";

try {
        File file = new File("readme.txt");
        if(!file.exists())file.createNewFile();

        byte[] bytes = message.getBytes();
        FileOutputStream fos = new FileOutputStream(file);

        try {
            fos.write(bytes);
            System.out.println("saved");
        }finally{
            fos.close();
        }






    }catch(Throwable e){
        e.printStackTrace();
    }

}
    
}
