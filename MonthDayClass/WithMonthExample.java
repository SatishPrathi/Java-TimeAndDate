import java.time.Month;
import java.time.MonthDay;

public class WithMonthExample {
    public static void main(String[] args) {
        MonthDay originalMonthDay = MonthDay.of(3, 5);
        MonthDay modifiedMonthDay = originalMonthDay.with(Month.JUNE);
        System.out.println("Modified Month-Day: " + modifiedMonthDay);
    }
}
