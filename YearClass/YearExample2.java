import java.time.Year;
import java.time.temporal.ChronoField;

public class YearExample2 {
    public static void main(String[] args) {
        Year year = Year.of(2023);
        int dayOfYear = year.get(ChronoField.DAY_OF_YEAR);
        System.out.println("Day of Year: " + dayOfYear);
    }
}
