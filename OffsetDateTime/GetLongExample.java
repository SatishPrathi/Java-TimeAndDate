import java.time.OffsetDateTime;
import java.time.temporal.ChronoField;

public class GetLongExample {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();

        long hour = offsetDateTime.getLong(ChronoField.HOUR_OF_DAY);

        System.out.println("Hour of day as a long: " + hour);
    }
}
