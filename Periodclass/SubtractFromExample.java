import java.time.LocalDate;
import java.time.Period;

public class SubtractFromExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 1, 1);
        Period period = Period.of(1, 2, 3);
        LocalDate result = date.minus(period);
        System.out.println("Result after subtraction: " + result);
    }
}
