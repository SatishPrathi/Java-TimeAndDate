import java.time.OffsetTime;
import java.time.temporal.ChronoField;

public class IsSupportedExample {
    public static void main(String[] args) {
        OffsetTime offsetTime = OffsetTime.now();
        
        boolean isSupported = offsetTime.isSupported(ChronoField.NANO_OF_SECOND);

        System.out.println("Is nanosecond field supported? " + isSupported);
    }
}
