import java.time.OffsetDateTime;
import java.time.LocalDate;

public class ToLocalDateExample {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();

        LocalDate localDate = offsetDateTime.toLocalDate();

        System.out.println("LocalDate part: " + localDate);
    }
}
