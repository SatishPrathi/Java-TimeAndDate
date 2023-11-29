import java.time.temporal.ChronoField;
import java.time.YearMonth;

public class GetExample {
    public static void main(String[] args) {
        YearMonth yearMonth = YearMonth.of(2023, 11);
        int year = yearMonth.get(ChronoField.YEAR);
        int month = yearMonth.get(ChronoField.MONTH_OF_YEAR);

        System.out.println("Year: " + year + ", Month: " + month);
    }
}
