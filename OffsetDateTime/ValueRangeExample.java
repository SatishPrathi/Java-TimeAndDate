import java.time.OffsetDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class ValueRangeExample {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();

        ValueRange range = offsetDateTime.range(ChronoField.HOUR_OF_DAY);

        System.out.println("Range for HOUR_OF_DAY field: " + range);
    }
}
