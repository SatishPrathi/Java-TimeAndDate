import java.time.MonthDay;

public class WithDayOfMonth {
    public static void main(String[] args) {
        MonthDay originalMonthDay = MonthDay.of(9, 12);
        MonthDay modifiedMonthDay = originalMonthDay.withDayOfMonth(25);
        System.out.println("Modified Month-Day: " + modifiedMonthDay);
    }
}
