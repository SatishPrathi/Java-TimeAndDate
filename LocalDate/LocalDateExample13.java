import java.time.LocalDate;
import java.time.Month;

public class LocalDateExample13 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 11, 27);
        Month month = date.getMonth();
        System.out.println("Month: " + month);
    }
}
