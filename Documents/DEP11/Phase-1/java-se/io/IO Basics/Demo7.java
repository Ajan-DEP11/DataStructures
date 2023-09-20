import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

public class Demo7 {
    public static void main(String[] args) throws Exception{
        File file = new File("Logo Mockup on panel wall.psd");
        FileInputStream fis = new FileInputStream(file);

        try{
            
         
            byte[] signatureBuffer = new byte[4];
            
            fis.read(signatureBuffer);
            System.out.println(new String(signatureBuffer));

            fis.skip(10);  //to skip the bytes

            byte[] widthInByte = new byte[4];
            fis.read(widthInByte);

            System.out.println(Arrays.toString(widthInByte)); //in files no sign bites only unsign bites

           int byte1 =( widthInByte[0] & 255) <<24;
           int byte2 = ( widthInByte[1] & 255) <<16;
           int byte3 = (widthInByte[2] & 255) << 8;
           int byte4 = (widthInByte[3] & 255);

            int width = byte1|byte2|byte3|byte4;
            System.out.println(width);



            
              
               System.out.println();

        }finally{
            fis.close();

        }
    }
}
