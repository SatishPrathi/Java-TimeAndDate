import java.time.Duration;
import java.time.Instant;

public class PlusExample {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        Duration duration = Duration.ofMinutes(30);

        Instant addedInstant = instant.plus(duration);
        System.out.println("Instant plus 30 minutes: " + addedInstant);
    }
}
