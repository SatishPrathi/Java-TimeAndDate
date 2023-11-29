import java.time.LocalDate;
import java.time.Year;

public class YearExample {
    public static void main(String[] args) {
        Year year = Year.of(2023);
        LocalDate date = year.atDay(150); 
        System.out.println(date);
    }
}
