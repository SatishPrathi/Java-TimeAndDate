import java.time.OffsetDateTime;

public class GetDayOfMonthExample {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();

        int dayOfMonth = offsetDateTime.getDayOfMonth();

        System.out.println("Day of month: " + dayOfMonth);
    }
}
