import java.time.ZoneId;

public class ToStringExample {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("America/Chicago");
        String zoneString = zoneId.toString();
        System.out.println("Zone ID as String: " + zoneString);
    }
}
