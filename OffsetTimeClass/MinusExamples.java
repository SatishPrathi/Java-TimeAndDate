import java.time.OffsetTime;

public class MinusExamples {
    public static void main(String[] args) {
        OffsetTime currentTime = OffsetTime.now();

        OffsetTime minusHours = currentTime.minusHours(2);
        OffsetTime minusMinutes = currentTime.minusMinutes(30);
        OffsetTime minusSeconds = currentTime.minusSeconds(45);
        OffsetTime minusNanos = currentTime.minusNanos(1_000_000_000);

        System.out.println("Current Time: " + currentTime);
        System.out.println("Time minus 2 hours: " + minusHours);
        System.out.println("Time minus 30 minutes: " + minusMinutes);
        System.out.println("Time minus 45 seconds: " + minusSeconds);
        System.out.println("Time minus 1 second in nanoseconds: " + minusNanos);
    }
}
