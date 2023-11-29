import java.time.Duration;
import java.time.LocalDateTime;

public class DurationExample {

    public static void main(String[] args) {
        Duration durationToAdd = Duration.ofMinutes(30);
        LocalDateTime startDateTime = LocalDateTime.now();
        LocalDateTime resultDateTime = startDateTime.plus(durationToAdd);
        System.out.println("Result after adding duration: " + resultDateTime);

        LocalDateTime endDateTime = LocalDateTime.now().plusHours(1);
        Duration durationBetween = Duration.between(startDateTime, endDateTime);
        System.out.println("Duration between two DateTimes: " + durationBetween);
    }
}
