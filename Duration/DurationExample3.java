import java.time.Duration;

public class DurationExample3 {

    public static void main(String[] args) {
        Duration originalDuration = Duration.ofHours(2);
        Duration addedDuration = originalDuration.plus(Duration.ofMinutes(30));
        System.out.println("Result after addition: " + addedDuration);

        Duration negativeDuration = Duration.ofMinutes(-45);
        System.out.println("Absolute duration: " + negativeDuration.abs());
    }
}
