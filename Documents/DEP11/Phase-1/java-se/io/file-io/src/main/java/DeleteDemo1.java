import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteDemo1 {
    public static void main(String[] args) {
        File fileRef = new File("/home/ajan/Desktop/dep11");
        boolean deleted = fileRef.delete();
        System.out.println(deleted? "Folder deleted" :"Folder does not exits");

        File fileRef2 = new File("/home/ajan/Desktop/New Folder");
        boolean deleted2 = fileRef2.delete();
        System.out.println(deleted2? "Folder deleted" :"Folder does not exits");

        Path pathRef = Paths.get("/home/ajan/Desktop/New Folder");
        try {
            Files.delete(pathRef);}catch (DirectoryNotEmptyException e)
        {

        }catch (IOException e){
            System.out.println("hsgslf");
            e.printStackTrace();
        }

    }
}
