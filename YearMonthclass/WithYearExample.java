import java.time.YearMonth;

public class WithYearExample {
    public static void main(String[] args) {
        YearMonth originalYearMonth = YearMonth.of(2023, 11);
        YearMonth modifiedYearMonth = originalYearMonth.withYear(2025);

        System.out.println("Original Year-Month: " + originalYearMonth);
        System.out.println("Modified Year-Month with new year: " + modifiedYearMonth);
    }
}
