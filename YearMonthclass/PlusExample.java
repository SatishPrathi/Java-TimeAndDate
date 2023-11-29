import java.time.Period;
import java.time.YearMonth;

public class PlusExample {
    public static void main(String[] args) {
        YearMonth yearMonth = YearMonth.of(2023, 11);
        Period periodToAdd = Period.ofMonths(3);

        YearMonth newYearMonth = yearMonth.plus(periodToAdd);
        System.out.println("Year-Month after adding 3 months: " + newYearMonth);
    }
}
