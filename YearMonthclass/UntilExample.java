import java.time.YearMonth;
import java.time.temporal.ChronoUnit;

public class UntilExample {
    public static void main(String[] args) {
        YearMonth currentYearMonth = YearMonth.now();
        YearMonth futureYearMonth = YearMonth.of(2024, 6);

        long monthsUntil = currentYearMonth.until(futureYearMonth, ChronoUnit.MONTHS);
        System.out.println("Months until future Year-Month: " + monthsUntil);
    }
}
