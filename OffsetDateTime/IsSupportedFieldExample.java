import java.time.OffsetDateTime;
import java.time.temporal.ChronoField;

public class IsSupportedFieldExample {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();

        boolean isSupported = offsetDateTime.isSupported(ChronoField.HOUR_OF_DAY);

        System.out.println("Is HOUR_OF_DAY supported? " + isSupported);
    }
}
