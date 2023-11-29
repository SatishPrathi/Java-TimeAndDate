import java.time.*;

public class WithMonthValue {
    public static void main(String[] args) {
        MonthDay originalMonthDay = MonthDay.of(7, 4);
        MonthDay modifiedMonthDay = originalMonthDay.withMonth(11);
        System.out.println("Modified Month-Day: " + modifiedMonthDay);
    }
}
