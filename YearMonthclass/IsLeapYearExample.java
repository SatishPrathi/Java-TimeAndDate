import java.time.YearMonth;

public class IsLeapYearExample {
    public static void main(String[] args) {
        YearMonth yearMonth = YearMonth.of(2020, 2);
        boolean isLeapYear = yearMonth.isLeapYear();

        System.out.println("Is Leap Year? " + isLeapYear);
    }
}
