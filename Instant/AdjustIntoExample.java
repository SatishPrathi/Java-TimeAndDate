import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class AdjustIntoExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2023, 1, 1, 12, 0);
        Instant instant = Instant.now();

        LocalDateTime adjustedDateTime = instant.adjustInto(localDateTime);
        System.out.println("Adjusted LocalDateTime: " + adjustedDateTime);
    }
}
