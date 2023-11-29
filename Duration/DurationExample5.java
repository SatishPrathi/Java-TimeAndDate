import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class DurationExample5 {

    public static void main(String[] args) {
        Duration customDuration = Duration.of(5, ChronoUnit.MINUTES);
        System.out.println("Custom duration: " + customDuration);

        System.out.println(Duration.ofDays(1));
        System.out.println(Duration.ofHours(2));
        System.out.println(Duration.ofMillis(500));
        System.out.println(Duration.ofMinutes(30));
        System.out.println(Duration.ofNanos(1000000000));
        System.out.println(Duration.ofSeconds(45));
    }
}
