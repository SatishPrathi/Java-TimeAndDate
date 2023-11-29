import java.time.OffsetDateTime;

public class MinusDaysExample {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();

        OffsetDateTime result = offsetDateTime.minusDays(5);

        System.out.println("Original date-time: " + offsetDateTime);
        System.out.println("Date-time after subtracting 5 days: " + result);
    }
}
