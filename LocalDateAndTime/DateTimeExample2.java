import java.time.*;
import java.time.temporal.ChronoField;

public class DateTimeExample2 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();

        int year = dateTime.get(ChronoField.YEAR);
        System.out.println("Year: " + year);
    }
}
