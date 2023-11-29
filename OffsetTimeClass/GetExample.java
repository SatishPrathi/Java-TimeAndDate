import java.time.OffsetTime;
import java.time.temporal.ChronoField;

public class GetExample {
    public static void main(String[] args) {
        OffsetTime offsetTime = OffsetTime.now();
        int hour = offsetTime.get(ChronoField.HOUR_OF_DAY);

        System.out.println("Hour of day: " + hour);
    }
}
