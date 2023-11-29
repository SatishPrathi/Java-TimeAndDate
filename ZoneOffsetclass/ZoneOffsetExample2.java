import java.time.ZoneOffset;
import java.time.temporal.ChronoField;

public class ZoneOffsetExample2 {
    public static void main(String[] args) {
        ZoneOffset offset = ZoneOffset.ofHours(5);

        boolean isSupported = offset.isSupported(ChronoField.HOUR_OF_DAY);
        System.out.println("Is HOUR_OF_DAY supported? " + isSupported);
    }
}
