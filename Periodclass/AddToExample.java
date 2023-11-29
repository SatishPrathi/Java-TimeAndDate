import java.time.LocalDate;
import java.time.Period;

public class AddToExample {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        Period period = Period.of(1, 2, 3);
        LocalDate endDate = startDate.plus(period);
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date after adding period: " + endDate);
    }
}
