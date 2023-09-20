import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo8 {
    public static void main(String[] args) {
        String text = "NIC \n" + "871234567v \n"+ "841234567v \n"+ "971234567v \n"+ "951234567v \n"+ "801234567v List";
        Pattern pattern = Pattern.compile("\\b\\d{9}[vV]\\b");
        Matcher matcher = pattern.matcher(text);

        matcher.find();
        System.out.println(text.substring(matcher.start(), matcher.end()));
        matcher.find();
        System.out.println(text.substring(matcher.start(), matcher.end()));
        matcher.find();
        System.out.println(text.substring(matcher.start(), matcher.end()));

        matcher.reset();

        System.out.println("-----------------------------------------");
        matcher.find();
        System.out.println(text.substring(matcher.start(), matcher.end()));
    }
}
