import java.time.format.DateTimeFormatter;
import java.time.YearMonth;

public class FormatExample {
    public static void main(String[] args) {
        YearMonth yearMonth = YearMonth.of(2023, 11);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM yyyy");

        String formattedString = yearMonth.format(formatter);
        System.out.println("Formatted Year-Month: " + formattedString);
    }
}
