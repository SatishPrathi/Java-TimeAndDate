import java.time.MonthDay;
import java.time.temporal.ChronoField;

public class GetExample {
    public static void main(String[] args) {
        MonthDay monthDay = MonthDay.of(12, 3);
        int monthValue = monthDay.get(ChronoField.MONTH_OF_YEAR);
        System.out.println("Month Value: " + monthValue);
    }
}
