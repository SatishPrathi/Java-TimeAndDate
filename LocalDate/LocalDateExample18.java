import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateExample18 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate parsedDate = LocalDate.parse("2023/11/27", formatter);
        System.out.println("Parsed Date with Formatter: " + parsedDate);
    }
}
