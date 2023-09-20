import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExistDemo {
    public static void main(String[] args) {
        File fileRef = new File("/home/ajan/abc.txt");
        System.out.println(fileRef.exists());

        Path pathRef = Paths.get("/home/ajan/abc.txt");
        System.out.println(Files.exists(pathRef));
    }
}
