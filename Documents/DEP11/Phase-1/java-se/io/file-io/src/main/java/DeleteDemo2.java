import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteDemo2 {
    public static void main(String[] args) {
        File fileRef = new File("/home/ajan/Desktop/New Folder");
        if(fileRef.isDirectory()){
            File[] fileList =fileRef.listFiles();
            for(File file: fileList){
                file.delete();
                System.out.println(file + "Deleted");
            }
        }
        fileRef.delete();
        System.out.println("File deleted");
    }

    //Path...
    Path pathRef =  Paths.get("/home/ajan/Desktop/New Folder");



}
