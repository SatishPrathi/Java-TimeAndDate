import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class PlusWithUnitExample {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        long hoursToAdd = 3;

        Instant addedInstant = instant.plus(hoursToAdd, ChronoUnit.HOURS);
        System.out.println("Instant plus 3 hours: " + addedInstant);
    }
}
