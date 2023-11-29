import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

public class FixedExample {
    public static void main(String[] args) {
        Instant fixedInstant = Instant.parse("2023-01-01T00:00:00Z");
        ZoneId fixedZone = ZoneId.of("UTC");
        Clock fixedClock = Clock.fixed(fixedInstant, fixedZone);
        Instant fixedInstantNow = fixedClock.instant();
        System.out.println("Fixed instant clock: " + fixedInstantNow);
    }
}
