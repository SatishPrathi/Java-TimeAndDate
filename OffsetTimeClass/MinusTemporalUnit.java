import java.time.OffsetTime;
import java.time.temporal.ChronoUnit;

public class MinusTemporalUnit {
    public static void main(String[] args) {
        OffsetTime currentTime = OffsetTime.now();
        OffsetTime subtractedTime = currentTime.minus(2, ChronoUnit.MINUTES);

        System.out.println("Current Time: " + currentTime);
        System.out.println("Time minus 2 minutes: " + subtractedTime);
    }
}
