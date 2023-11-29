import java.time.ZonedDateTime;
import java.time.ZoneId;

public class WithZoneExample {
    public static void main(String[] args) {
        ZonedDateTime originalDateTime = ZonedDateTime.now();
        ZoneId newZone = ZoneId.of("America/New_York");
        ZonedDateTime newDateTime = originalDateTime.withZoneSameInstant(newZone);
        System.out.println("New DateTime in " + newZone + ": " + newDateTime);
    }
}
