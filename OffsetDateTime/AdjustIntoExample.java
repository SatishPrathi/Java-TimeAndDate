import java.time.OffsetDateTime;
import java.time.LocalDate;

public class AdjustIntoExample {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        LocalDate targetDate = LocalDate.of(2023, 1, 1);

        LocalDate adjustedDate = offsetDateTime.adjustInto(targetDate);

        System.out.println("Original OffsetDateTime: " + offsetDateTime);
        System.out.println("Adjusted LocalDate: " + adjustedDate);
    }
}
