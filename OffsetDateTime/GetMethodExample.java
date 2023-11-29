import java.time.OffsetDateTime;
import java.time.temporal.ChronoField;

public class GetMethodExample {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();

        int hour = offsetDateTime.get(ChronoField.HOUR_OF_DAY);

        System.out.println("Hour of day: " + hour);
    }
}
