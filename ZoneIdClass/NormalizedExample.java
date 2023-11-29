import java.time.ZoneId;

public class NormalizedExample {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("UTC+02:00");
        ZoneId normalizedZone = zoneId.normalized();
        System.out.println("Normalized Zone: " + normalizedZone);
    }
}
