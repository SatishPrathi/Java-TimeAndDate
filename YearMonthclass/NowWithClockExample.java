import java.time.Clock;
import java.time.YearMonth;

public class NowWithClockExample {
    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        YearMonth currentYearMonth = YearMonth.now(clock);
        System.out.println("Current Year-Month with Clock: " + currentYearMonth);
    }
}
