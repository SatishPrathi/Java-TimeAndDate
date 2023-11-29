import java.time.OffsetDateTime;

public class PlusDaysExample {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();

        OffsetDateTime result = offsetDateTime.plusDays(3);

        System.out.println("Original date-time: " + offsetDateTime);
        System.out.println("Date-time after adding 3 days: " + result);
    }
}
