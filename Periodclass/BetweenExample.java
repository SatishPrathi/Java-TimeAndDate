import java.time.LocalDate;
import java.time.Period;

public class BetweenExample {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2022, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 1, 1);
        Period period = Period.between(startDate, endDate);
        System.out.println("Period between two dates: " + period);
    }
}
