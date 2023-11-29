import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class TruncatedToExample {
    public static void main(String[] args) {
        Instant instant = Instant.now();

        Instant truncatedInstant = instant.truncatedTo(ChronoUnit.MINUTES);
        System.out.println("Truncated Instant: " + truncatedInstant);
    }
}
