import java.time.Instant;
import java.time.temporal.ChronoField;

public class GetLongExample {
    public static void main(String[] args) {
        Instant instant = Instant.now();

        long epochSecond = instant.getLong(ChronoField.INSTANT_SECONDS);
        System.out.println("Epoch Second as Long: " + epochSecond);
    }
}
