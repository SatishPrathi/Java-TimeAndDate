import java.time.Duration;

public class DurationExample2 {

    public static void main(String[] args) {
        Duration zeroDuration = Duration.ofSeconds(0);
        System.out.println("Is zero duration? " + zeroDuration.isZero());

        Duration originalDuration = Duration.ofHours(2);
        Duration subtractedDuration = originalDuration.minus(Duration.ofMinutes(30));
        System.out.println("Result after subtraction: " + subtractedDuration);
    }
}
