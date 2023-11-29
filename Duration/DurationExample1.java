import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class DurationExample1 {

    public static void main(String[] args) {
        Duration duration = Duration.ofHours(2);
        long hours = duration.get(ChronoUnit.HOURS);
        System.out.println("Hours in the duration: " + hours);

        Duration negativeDuration = Duration.ofMinutes(-30);
        System.out.println("Is negative duration? " + negativeDuration.isNegative());
    }
}
