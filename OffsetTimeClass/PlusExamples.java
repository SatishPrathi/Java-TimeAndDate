import java.time.OffsetTime;

public class PlusExamples {
    public static void main(String[] args) {
        OffsetTime currentTime = OffsetTime.now();

        OffsetTime plusHours = currentTime.plusHours(2);
        OffsetTime plusMinutes = currentTime.plusMinutes(30);
        OffsetTime plusSeconds = currentTime.plusSeconds(45);
        OffsetTime plusNanos = currentTime.plusNanos(1_000_000_000);

        System.out.println("Current Time: " + currentTime);
        System.out.println("Time plus 2 hours: " + plusHours);
        System.out.println("Time plus 30 minutes: " + plusMinutes);
        System.out.println("Time plus 45 seconds: " + plusSeconds);
        System.out.println("Time plus 1 second in nanoseconds: " + plusNanos);
    }
}
