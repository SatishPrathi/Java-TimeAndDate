import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class FormatExample {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = offsetDateTime.format(formatter);

        System.out.println("Formatted date-time: " + formattedDateTime);
    }
}
