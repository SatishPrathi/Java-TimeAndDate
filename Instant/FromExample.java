import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;

public class FromExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2023, Month.FEBRUARY, 15, 18, 30);
        Instant instant = Instant.from(localDateTime);

        System.out.println("Instant from LocalDateTime: " + instant);
    }
}
