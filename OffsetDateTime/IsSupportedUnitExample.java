import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;

public class IsSupportedUnitExample {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();

        boolean isSupported = offsetDateTime.isSupported(ChronoUnit.DAYS);

        System.out.println("Is DAYS supported? " + isSupported);
    }
}
