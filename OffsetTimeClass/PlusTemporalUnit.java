import java.time.OffsetTime;
import java.time.temporal.ChronoUnit;

public class PlusTemporalUnit {
    public static void main(String[] args) {
        OffsetTime currentTime = OffsetTime.now();
        OffsetTime addedTime = currentTime.plus(3, ChronoUnit.HOURS);

        System.out.println("Current Time: " + currentTime);
        System.out.println("Time plus 3 hours: " + addedTime);
    }
}
