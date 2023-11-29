import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;

public class OfInstantExample {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        ZoneId zoneId = ZoneId.of("America/New_York");

        OffsetDateTime offsetDateTime = OffsetDateTime.ofInstant(instant, zoneId);

        System.out.println("OffsetDateTime created from Instant and ZoneId: " + offsetDateTime);
    }
}
