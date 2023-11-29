import java.time.DayOfWeek;

public class DayOfWeekExample2 {
    public static void main(String[] args) {
        DayOfWeek today = DayOfWeek.MONDAY;

        if (today == DayOfWeek.FRIDAY) {
            System.out.println("It's Friday! Time to celebrate!");
        } else {
            System.out.println("It's not Friday yet. Keep going!");
        }
    }
}
