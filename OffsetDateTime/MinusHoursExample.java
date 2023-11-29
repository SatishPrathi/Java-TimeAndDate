import java.time.OffsetDateTime;

public class MinusHoursExample {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();

        OffsetDateTime result = offsetDateTime.minusHours(4);

        System.out.println("Original date-time: " + offsetDateTime);
        System.out.println("Date-time after subtracting 4 hours: " + result);
    }
}
