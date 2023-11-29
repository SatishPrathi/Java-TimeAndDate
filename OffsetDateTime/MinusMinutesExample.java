import java.time.OffsetDateTime;

public class MinusMinutesExample {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();

        OffsetDateTime result = offsetDateTime.minusMinutes(30);

        System.out.println("Original date-time: " + offsetDateTime);
        System.out.println("Date-time after subtracting 30 minutes: " + result);
    }
}
