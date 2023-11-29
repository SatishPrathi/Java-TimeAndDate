import java.time.OffsetDateTime;

public class MinusNanosExample {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();

        OffsetDateTime result = offsetDateTime.minusNanos(500_000_000);

        System.out.println("Original date-time: " + offsetDateTime);
        System.out.println("Date-time after subtracting 500 million nanoseconds: " + result);
    }
}
