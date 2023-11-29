import java.time.OffsetTime;
import java.time.temporal.ChronoUnit;

public class MinusExample {
    public static void main(String[] args) {
        OffsetTime currentTime = OffsetTime.now();
        OffsetTime subtractedTime = currentTime.minus(1, ChronoUnit.HOURS);

        System.out.println("Current Time: " + currentTime);
        System.out.println("Time minus 1 hour: " + subtractedTime);
    }
}
