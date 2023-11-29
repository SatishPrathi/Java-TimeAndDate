import java.time.Month;
import java.time.MonthDay;

public class GetMonth{
    public static void main(String[] args) {
        MonthDay monthDay = MonthDay.of(11, 10);
        Month month = monthDay.getMonth();
        System.out.println("Month: " + month);
    }
}
