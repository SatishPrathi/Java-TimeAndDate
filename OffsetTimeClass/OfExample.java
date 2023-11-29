import java.time.LocalTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;

public class OfExample {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(12, 30);
        ZoneOffset offset = ZoneOffset.ofHours(5);
        OffsetTime offsetTime = OffsetTime.of(localTime, offset);

        System.out.println("Offset Time: " + offsetTime);
    }
}
