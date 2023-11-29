import java.time.OffsetDateTime;

public class GetDayOfYearExample {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();

        int dayOfYear = offsetDateTime.getDayOfYear();

        System.out.println("Day of year: " + dayOfYear);
    }
}
