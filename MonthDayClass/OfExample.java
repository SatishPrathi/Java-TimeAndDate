import java.time.MonthDay;

public class OfExample {
    public static void main(String[] args) {
        MonthDay customMonthDay = MonthDay.of(6, 15);
        System.out.println("Custom Month-Day: " + customMonthDay);
    }
}
