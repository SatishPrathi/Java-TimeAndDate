import java.time.YearMonth;

public class CompareToExample {
    public static void main(String[] args) {
        YearMonth yearMonth1 = YearMonth.of(2023, 11);
        YearMonth yearMonth2 = YearMonth.of(2022, 12);

        int comparisonResult = yearMonth1.compareTo(yearMonth2);
        System.out.println("Comparison Result: " + comparisonResult);
    }
}
