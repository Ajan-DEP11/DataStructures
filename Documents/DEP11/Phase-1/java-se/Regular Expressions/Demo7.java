import java.util.regex.Pattern;

public class Demo7 {
    public static void main(String[] args) {
        String endpoint1 = "https://photoslibrary.googleapis.com:443/v1/albums/10";
        String endpoint2 = "http://people.googleapis.com:80/v2/me/connections";

        String pattern= "http[s]?://[a-z]+[.]googleapis.com:[0-9]{1,5}/v\\d+/.+";
        System.out.println(endpoint1.matches(pattern));
        System.out.println(endpoint2.matches(pattern));
    }
}
