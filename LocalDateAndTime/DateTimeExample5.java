import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeExample5 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 1, 1);
        LocalTime time = LocalTime.of(12, 0);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        System.out.println("Combined DateTime: " + dateTime);
    }
}
