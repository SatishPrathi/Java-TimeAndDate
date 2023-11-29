import java.time.*;
import java.time.MonthDay;

public class ClockExample {
    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        MonthDay currentMonthDay = MonthDay.now(clock);
        System.out.println("Current Month-Day with Clock: " + currentMonthDay);
    }
}
