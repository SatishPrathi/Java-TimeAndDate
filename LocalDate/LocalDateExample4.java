import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateExample4 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 11, 27);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = date.format(formatter);
        System.out.println("Formatted Date: " + formattedDate);
    }
}
