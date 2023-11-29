import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeExample1 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String formattedDateTime = dateTime.format(formatter);
        System.out.println("Formatted DateTime: " + formattedDateTime);
    }
}
