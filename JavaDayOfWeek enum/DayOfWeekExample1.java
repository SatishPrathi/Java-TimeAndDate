import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayOfWeekExample1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 11, 29); // Replace with your desired date
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
            System.out.println("It's the weekend!");
        } else {
            System.out.println("It's a weekday.");
        }
    }
}
