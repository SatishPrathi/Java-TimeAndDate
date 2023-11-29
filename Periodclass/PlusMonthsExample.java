import java.time.Period;

public class PlusMonthsExample {
    public static void main(String[] args) {
        Period period = Period.of(1, 2, 3);
        Period newPeriod = period.plusMonths(6);
        System.out.println("New Period after adding months: " + newPeriod);
    }
}
