import java.time.Period;

public class PlusYearsExample {
    public static void main(String[] args) {
        Period period = Period.of(1, 2, 3);
        Period newPeriod = period.plusYears(5);
        System.out.println("New Period after adding years: " + newPeriod);
    }
}
