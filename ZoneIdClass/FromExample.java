import java.time.LocalDateTime;
import java.time.ZoneId;

public class FromExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        ZoneId zoneId = ZoneId.from(localDateTime);
        System.out.println("Zone ID from LocalDateTime: " + zoneId);
    }
}
