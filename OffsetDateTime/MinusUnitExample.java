import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;

public class MinusUnitExample {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();

        OffsetDateTime result = offsetDateTime.minus(2, ChronoUnit.DAYS);

        System.out.println("Original date-time: " + offsetDateTime);
        System.out.println("Date-time after subtracting 2 days: " + result);
    }
}
