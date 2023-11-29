import java.time.MonthDay;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class RangeExample {
    public static void main(String[] args) {
        MonthDay monthDay = MonthDay.of(10, 1);
        ValueRange range = monthDay.range(ChronoField.DAY_OF_MONTH);
        System.out.println("Range of Valid Values: " + range);
    }
}
