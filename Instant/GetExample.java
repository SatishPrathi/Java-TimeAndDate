import java.time.Instant;
import java.time.temporal.ChronoField;

public class GetExample {
    public static void main(String[] args) {
        Instant instant = Instant.now();

        long epochSecond = instant.get(ChronoField.INSTANT_SECONDS);
        System.out.println("Epoch Second: " + epochSecond);
    }
}
