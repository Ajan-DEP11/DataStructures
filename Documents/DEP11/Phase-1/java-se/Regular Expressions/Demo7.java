import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo7 {
    public static void main(String[] args) {
        String endpoint1 = "https://photoslibrary.googleapis.com:443/v1/albums/10";
        String endpoint2 = "http://people.googleapis.com:80/v2/me/connections";

        String pattern= "(?<protocol>http[s]?)://(?<host>(?<service>[a-z]+)[.]googleapis.com):(?<port>\\d{1,5})/v(?<version>\\d+)/(?<path>.+)";
        System.out.println(endpoint1.matches(pattern));
        System.out.println(endpoint2.matches(pattern));

        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(endpoint1);

        matcher.find();
        System.out.println("protocol:"+ matcher.group(1));
        System.out.println("host:" + matcher.group(2));
        System.out.println("service:"+matcher.group(3));
        System.out.println("port:" + matcher.group(4));
        System.out.println("version :"+matcher.group("version"));
        System.out.println("path:" + matcher.group("path"));
    }
}
