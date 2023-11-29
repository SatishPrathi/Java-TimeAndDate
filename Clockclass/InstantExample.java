import java.time.Clock;
import java.time.Instant;

public class InstantExample {
    public static void main(String[] args) {
        Instant currentInstant = Clock.systemUTC().instant();
        System.out.println("Current UTC Instant: " + currentInstant);
    }
}
