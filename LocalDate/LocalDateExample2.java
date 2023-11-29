import java.time.LocalDate;

public class LocalDateExample2 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2023, 11, 27);
        LocalDate date2 = LocalDate.of(2023, 12, 1);
        int comparisonResult = date1.compareTo(date2);
        System.out.println("Comparison Result: " + comparisonResult);
    }
}
