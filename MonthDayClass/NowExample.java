import java.time.MonthDay;

public class NowExample {
    public static void main(String[] args) {
        MonthDay currentMonthDay = MonthDay.now();
        System.out.println("Current Month-Day: " + currentMonthDay);
    }
}
