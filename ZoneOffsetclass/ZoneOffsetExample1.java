import java.time.ZoneOffset;

public class ZoneOffsetExample1 {
    public static void main(String[] args) {
        ZoneOffset offset = ZoneOffset.ofHours(3);

        int offsetSeconds = offset.get(ZoneOffset.OFFSET_SECONDS);
        System.out.println("Offset in seconds: " + offsetSeconds);
    }
}
