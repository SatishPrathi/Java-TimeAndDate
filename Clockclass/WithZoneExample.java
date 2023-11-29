import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

public class WithZoneExample {
    public static void main(String[] args) {
        Clock originalClock = Clock.systemDefaultZone();
        ZoneId newZone = ZoneId.of("Europe/London");
        Clock newZoneClock = originalClock.withZone(newZone);
        Instant newZoneInstant = newZoneClock.instant();
        System.out.println("Current instant in the new time zone: " + newZoneInstant);
    }
}
