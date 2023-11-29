import java.time.*;

public class GetDayOfMonth {
    public static void main(String[] args) {
        MonthDay monthDay = MonthDay.of(9, 25);
        int dayOfMonth = monthDay.getDayOfMonth();
        System.out.println("Day of Month: " + dayOfMonth);
    }
}
