import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class MinusExample {
    public static void main(String[] args) {
        ZonedDateTime originalDateTime = ZonedDateTime.now();
        ZonedDateTime subtractedDateTime = originalDateTime.minus(1, ChronoUnit.DAYS);
        System.out.println("Subtracted DateTime: " + subtractedDateTime);
    }
}
