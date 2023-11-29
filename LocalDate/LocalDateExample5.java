import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LocalDateExample5 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 11, 27);
        int year = date.get(ChronoField.YEAR);
        System.out.println("Year: " + year);
    }
}
