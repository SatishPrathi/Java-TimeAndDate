import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class PlusExample {
    public static void main(String[] args) {
        ZonedDateTime originalDateTime = ZonedDateTime.now();
        ZonedDateTime addedDateTime = originalDateTime.plus(1, ChronoUnit.HOURS);
        System.out.println("Added DateTime: " + addedDateTime);
    }
}
