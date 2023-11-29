import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class AtOffsetExample {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        ZoneOffset offset = ZoneOffset.ofHours(2);

        OffsetDateTime offsetDateTime = instant.atOffset(offset);
        System.out.println("Offset DateTime: " + offsetDateTime);
    }
}
