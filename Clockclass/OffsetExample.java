import java.time.Clock;
import java.time.Duration;
import java.time.Instant;

public class OffsetExample {
    public static void main(String[] args) {
        Clock baseClock = Clock.systemDefaultZone();
        Duration offset = Duration.ofHours(3);
        Clock offsetClock = Clock.offset(baseClock, offset);
        Instant offsetInstant = offsetClock.instant();
        System.out.println("Current instant with 3 hours offset: " + offsetInstant);
    }
}

