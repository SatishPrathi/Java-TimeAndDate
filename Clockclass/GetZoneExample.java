import java.time.Clock;
import java.time.ZoneId;

public class GetZoneExample {
    public static void main(String[] args) {
        ZoneId zone = Clock.systemDefaultZone().getZone();
        System.out.println("Current time zone: " + zone);
    }
}
