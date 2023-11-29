import java.time.ZoneId;

public class IdExample {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("Europe/Paris");
        String id = zoneId.getId();
        System.out.println("Zone ID: " + id);
    }
}
