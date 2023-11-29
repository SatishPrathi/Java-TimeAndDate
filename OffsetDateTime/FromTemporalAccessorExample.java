import java.time.OffsetDateTime;
import java.time.LocalDateTime;

public class FromTemporalAccessorExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2023, 1, 15, 12, 0);

        OffsetDateTime offsetDateTime = OffsetDateTime.from(localDateTime);

        System.out.println("OffsetDateTime from LocalDateTime: " + offsetDateTime);
    }
}
