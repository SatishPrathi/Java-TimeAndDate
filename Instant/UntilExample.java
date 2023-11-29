import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class UntilExample {
    public static void main(String[] args) {
        Instant startInstant = Instant.now();
        Instant endInstant = Instant.now().plus(2, ChronoUnit.HOURS);

        long hoursUntil = startInstant.until(endInstant, ChronoUnit.HOURS);
        System.out.println("Hours until: " + hoursUntil);
    }
}
