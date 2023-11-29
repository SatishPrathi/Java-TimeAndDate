import java.time.ZoneId;
import java.time.zone.ZoneRules;

public class RulesExample {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("America/Los_Angeles");
        ZoneRules zoneRules = zoneId.getRules();
        System.out.println("Zone Rules: " + zoneRules);
    }
}
