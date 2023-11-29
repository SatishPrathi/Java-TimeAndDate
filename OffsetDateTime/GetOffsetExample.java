import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class GetOffsetExample {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();

        ZoneOffset zoneOffset = offsetDateTime.getOffset();

        System.out.println("Zone Offset: " + zoneOffset);
    }
}
