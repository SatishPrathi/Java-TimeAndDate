import java.time.LocalDate;
import java.time.DayOfWeek;

public class LocalDateExample11 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 11, 27);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println("Day of Week: " + dayOfWeek);
    }
}
