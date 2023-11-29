import java.time.YearMonth;

public class WithMonthExample {
    public static void main(String[] args) {
        YearMonth originalYearMonth = YearMonth.of(2023, 11);
        YearMonth modifiedYearMonth = originalYearMonth.withMonth(5);

        System.out.println("Original Year-Month: " + originalYearMonth);
        System.out.println("Modified Year-Month with new month: " + modifiedYearMonth);
    }
}
