import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class OfExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2023, 1, 1);
        LocalTime localTime = LocalTime.of(12, 0);
        ZoneId zone = ZoneId.of("Asia/Kolkata");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDate, localTime, zone);
        System.out.println("Custom DateTime: " + zonedDateTime);
    }
}
