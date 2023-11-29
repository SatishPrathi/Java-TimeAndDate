import java.time.Period;
import java.time.temporal.ChronoUnit;

public class GetExample {
    public static void main(String[] args) {
        Period period = Period.of(1, 2, 3);
        int years = period.get(ChronoUnit.YEARS);
        System.out.println("Years: " + years);
    }
}
