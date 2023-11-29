import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FormatExample {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = zonedDateTime.format(formatter);
        System.out.println("Formatted DateTime: " + formattedDateTime);
    }
}
