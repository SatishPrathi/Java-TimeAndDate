import java.time.ZoneOffset;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class ZoneOffsetExample6 {
    public static void main(String[] args) {
        ZoneOffset offset = ZoneOffset.ofHours(6);

        ValueRange range = offset.range(ChronoField.HOUR_OF_DAY);
        System.out.println("Valid range for HOUR_OF_DAY: " + range);
    }
}
