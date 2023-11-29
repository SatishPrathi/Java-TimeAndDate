import java.time.ZoneId;

public class EqualsExample {
    public static void main(String[] args) {
        ZoneId zone1 = ZoneId.of("Europe/London");
        ZoneId zone2 = ZoneId.of("Europe/Lisbon");
        
        boolean areEqual = zone1.equals(zone2);
        System.out.println("Are the time zones equal? " + areEqual);
    }
}
