import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeExample1 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(12, 30, 45);
        LocalDate date = LocalDate.of(2023, 11, 27);

        LocalDateTime dateTime = time.atDate(date);
        System.out.println("Combined Date-Time: " + dateTime);
    }
}
