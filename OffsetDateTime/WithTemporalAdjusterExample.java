import java.time.OffsetDateTime;
import java.time.temporal.TemporalAdjusters;

public class WithTemporalAdjusterExample {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();

        OffsetDateTime adjustedDateTime = offsetDateTime.with(TemporalAdjusters.lastDayOfMonth());

        System.out.println("Original date-time: " + offsetDateTime);
        System.out.println("Date-time adjusted to the last day of the month: " + adjustedDateTime);
    }
}
