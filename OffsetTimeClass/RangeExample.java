import java.time.OffsetTime;
import java.time.temporal.ChronoField;

public class RangeExample {
    public static void main(String[] args) {
        OffsetTime offsetTime = OffsetTime.now();
        ValueRange range = offsetTime.range(ChronoField.HOUR_OF_DAY);

        System.out.println("Valid range for hour of day: " + range);
    }
}
