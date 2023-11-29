import java.time.ZonedDateTime;
import java.time.ZoneId;

public class GetZoneExample {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        ZoneId zone = zonedDateTime.getZone();
        System.out.println("Time Zone: " + zone);
    }
}
