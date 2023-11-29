import java.time.ZoneOffset;

public class ZoneOffsetExample5 {
    public static void main(String[] args) {
        ZoneOffset offset = ZoneOffset.ofHoursMinutes(-3, 30);
        System.out.println("Zone Offset: " + offset);
    }
}
