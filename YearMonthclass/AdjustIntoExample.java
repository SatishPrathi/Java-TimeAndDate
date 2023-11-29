import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.Temporal;

public class AdjustIntoExample {
    public static void main(String[] args) {
        YearMonth yearMonth = YearMonth.of(2023, 11);
        LocalDate date = LocalDate.of(2020, 5, 15);

        Temporal adjustedTemporal = yearMonth.adjustInto(date);
        System.out.println("Adjusted Date: " + adjustedTemporal);
    }
}
