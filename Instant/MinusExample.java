import java.time.Duration;
import java.time.Instant;

public class MinusExample {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        Duration duration = Duration.ofHours(2);

        Instant subtractedInstant = instant.minus(duration);
        System.out.println("Instant minus 2 hours: " + subtractedInstant);
    }
}
