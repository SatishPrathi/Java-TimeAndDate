import java.time.ZoneId;
import java.time.ZoneOffset;

public class OffsetExample {
    public static void main(String[] args) {
        ZoneOffset offset = ZoneOffset.of("+05:30");
        ZoneId zoneId = ZoneId.ofOffset("Custom", offset);
        System.out.println("Zone ID with Offset: " + zoneId);
    }
}
