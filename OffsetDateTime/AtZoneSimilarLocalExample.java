import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class AtZoneSimilarLocalExample {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        

          ZoneId targetZone = ZoneId.of("America/New_York");

        ZonedDateTime zonedDateTime = offsetDateTime.atZoneSimilarLocal(targetZone);

        
            System.out.println("Original OffsetDateTime: " + offsetDateTime);

        System.out.println("ZonedDateTime in " + targetZone + ": " + zonedDateTime);
    }
}
