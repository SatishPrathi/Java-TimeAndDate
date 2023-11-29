import java.time.ZoneId;

public class OfExample {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("Asia/Tokyo");
        System.out.println("Zone ID: " + zoneId);
    }
}
