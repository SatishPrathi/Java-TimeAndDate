import java.time.OffsetDateTime;
import java.time.DayOfWeek;

public class GetDayOfWeekExample {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();

        DayOfWeek dayOfWeek = offsetDateTime.getDayOfWeek();

        System.out.println("Day of week: " + dayOfWeek);
    }
}
