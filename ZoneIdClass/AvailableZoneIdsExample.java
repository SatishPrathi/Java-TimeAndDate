import java.time.ZoneId;
import java.util.Set;

public class AvailableZoneIdsExample {
    public static void main(String[] args) {
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println("Available Zone IDs: " + availableZoneIds);
    }
}
