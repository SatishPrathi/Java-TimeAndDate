import java.time.ZoneId;

public class HashCodeExample {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("Australia/Sydney");
        int hashCode = zoneId.hashCode();
        System.out.println("Hash Code: " + hashCode);
    }
}
