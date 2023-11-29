import java.time.LocalDate;
import java.time.YearMonth;

public class AtEndOfMonthExample {
    public static void main(String[] args) {
        YearMonth yearMonth = YearMonth.of(2023, 11);
        LocalDate endOfMonth = yearMonth.atEndOfMonth();

        System.out.println("Last day of the month: " + endOfMonth);
    }
}
