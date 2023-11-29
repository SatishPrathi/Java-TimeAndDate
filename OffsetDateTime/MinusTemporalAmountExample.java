import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;

public class MinusTemporalAmountExample {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();

        OffsetDateTime result = offsetDateTime.minus(3, ChronoUnit.DAYS).minus(12, ChronoUnit.HOURS);

        System.out.println("Original date-time: " + offsetDateTime);
        System.out.println("Date-time after subtracting 3 days and 12 hours: " + result);
    }
}
