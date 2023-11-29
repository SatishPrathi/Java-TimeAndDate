import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;

public class TruncatedToExample {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();

        OffsetDateTime truncatedDateTime = offsetDateTime.truncatedTo(ChronoUnit.HOURS);

        System.out.println("Original date-time: " + offsetDateTime);
        System.out.println("Truncated date-time: " + truncatedDateTime);
    }
}
