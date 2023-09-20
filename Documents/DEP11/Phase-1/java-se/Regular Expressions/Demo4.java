import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo4 {
    public static void main(String[] args) {
        //pattern, Mathes
       // String compile = Pattern.compile(regex);

       String txt = "My NIC is : 123456789v";
       Pattern pattern = Pattern.compile("\\d{9}[vV]");
       Matcher matcher= pattern.matcher(txt);

       System.out.println(matcher.find());
       System.out.println(matcher.start());
       System.out.println(matcher.end());
       System.out.println(txt.substring(matcher.start(),matcher.end()));
    }
}
