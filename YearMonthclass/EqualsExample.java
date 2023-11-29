import java.time.YearMonth;

public class EqualsExample {
    public static void main(String[] args) {
        YearMonth yearMonth1 = YearMonth.of(2023, 11);
        YearMonth yearMonth2 = YearMonth.of(2023, 11);

        boolean areEqual = yearMonth1.equals(yearMonth2);
        System.out.println("Are Year-Months equal? " + areEqual);
    }
}
