import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OfLocalDateTimeExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2023, 6, 15);
        LocalTime localTime = LocalTime.of(12, 30);
        ZoneOffset zoneOffset = ZoneOffset.ofHours(2);

        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDate, localTime, zoneOffset);

        System.out.println("OffsetDateTime created using LocalDate, LocalTime, and ZoneOffset: " + offsetDateTime);
    }
}
