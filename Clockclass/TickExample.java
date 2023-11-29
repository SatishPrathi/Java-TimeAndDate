import java.time.Clock;
import java.time.Duration;
import java.time.Instant;

public class TickExample {
    public static void main(String[] args) {
        Clock baseClock = Clock.systemDefaultZone();
        Duration tickDuration = Duration.ofSeconds(10);
        Clock tickClock = Clock.tick(baseClock, tickDuration);
        Instant tickInstant = tickClock.instant();
        System.out.println("Current instant truncated to the nearest 10 seconds: " + tickInstant);
    }
}
