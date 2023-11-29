import java.time.ZoneId;
import java.util.HashMap;
import java.util.Map;

public class AliasMapExample {
    public static void main(String[] args) {
        Map<String, String> aliasMap = new HashMap<>();
        aliasMap.put("GMT", "UTC");

        ZoneId zoneId = ZoneId.of("GMT", aliasMap);
        System.out.println("Zone ID with Alias: " + zoneId);
    }
}
