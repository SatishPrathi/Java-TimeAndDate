import java.time.Period;
import java.time.YearMonth;

public class MinusExample {
    public static void main(String[] args) {
        YearMonth yearMonth = YearMonth.of(2023, 11);
        Period periodToSubtract = Period.ofMonths(2);

        YearMonth newYearMonth = yearMonth.minus(periodToSubtract);
        System.out.println("Year-Month after subtracting 2 months: " + newYearMonth);
    }
}
