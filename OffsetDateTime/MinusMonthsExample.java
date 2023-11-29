import java.time.OffsetDateTime;

public class MinusMonthsExample {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();

        OffsetDateTime result = offsetDateTime.minusMonths(6);

        System.out.println("Original date-time: " + offsetDateTime);
        System.out.println("Date-time after subtracting 6 months: " + result);
    }
}
