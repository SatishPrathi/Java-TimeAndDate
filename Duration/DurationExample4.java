import java.time.Duration;

public class DurationExample4 {

    public static void main(String[] args) {
        Duration duration1 = Duration.ofHours(2);
        Duration duration2 = Duration.ofMinutes(120);
        System.out.println("Comparison result: " + duration1.compareTo(duration2));

        Duration duration = Duration.ofSeconds(65, 500000000);
        System.out.println("Seconds: " + duration.getSeconds());
        System.out.println("Nanoseconds: " + duration.getNano());
    }
}
