import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class ZoneOffsetExample {
    public static void main(String[] args) {
        ZoneOffset offset1 = ZoneOffset.ofHours(2);
        LocalDateTime dateTime = LocalDateTime.now();

        LocalDateTime adjustedDateTime = offset1.adjustInto(dateTime);
        System.out.println("Original DateTime: " + dateTime);
        System.out.println("Adjusted DateTime: " + adjustedDateTime);
    }
}
