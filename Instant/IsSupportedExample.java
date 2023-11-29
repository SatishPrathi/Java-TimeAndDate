import java.time.Instant;
import java.time.temporal.ChronoField;

public class IsSupportedExample {
    public static void main(String[] args) {
        Instant instant = Instant.now();

        boolean isSupported = instant.isSupported(ChronoField.NANO_OF_SECOND);
        System.out.println("Nanoseconds Supported: " + isSupported);
    }
}
