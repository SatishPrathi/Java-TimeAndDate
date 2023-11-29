import java.time.Year;
import java.time.format.DateTimeFormatter;

public class YearExample1 {
    public static void main(String[] args) {
        Year year = Year.of(2023);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
        String formattedYear = year.format(formatter);
        System.out.println(formattedYear);
    }
}
