import java.time.OffsetTime;
import java.time.temporal.ChronoUnit;

public class TruncatedTo {
    public static void main(String[] args) {
        OffsetTime currentTime = OffsetTime.now();
        OffsetTime truncatedTime = currentTime.truncatedTo(ChronoUnit.MINUTES);

        System.out.println("Current Time: " + currentTime);
        System.out.println("Truncated Time to Minutes: " + truncatedTime);
    }
}
