import java.time.Clock;
import java.time.ZoneId;

public class SystemWithZoneExample {
    public static void main(String[] args) {
        ZoneId customZone = ZoneId.of("America/New_York");
        Clock customZoneClock = Clock.system(customZone);
        Instant customZoneInstant = customZoneClock.instant();
        System.out.println("Current instant in custom zone: " + customZoneInstant);
    }
}
