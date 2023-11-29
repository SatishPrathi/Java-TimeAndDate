import java.time.LocalDate;
import java.time.MonthDay;

public class AtYearExample {
    public static void main(String[] args) {
        MonthDay monthDay = MonthDay.of(12, 3);
        LocalDate localDate = monthDay.atYear(2023);
        System.out.println("Date at Year: " + localDate);
    }
}
