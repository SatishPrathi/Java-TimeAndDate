import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class AtZoneExample {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        ZoneId zone = ZoneId.of("America/New_York");

        ZonedDateTime zonedDateTime = instant.atZone(zone);
        System.out.println("Zoned DateTime: " + zonedDateTime);
    }
}
