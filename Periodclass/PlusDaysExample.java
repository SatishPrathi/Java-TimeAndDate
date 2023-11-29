import java.time.Period;

public class PlusDaysExample {
    public static void main(String[] args) {
        Period period = Period.of(1, 2, 3);
        Period newPeriod = period.plusDays(7);
        System.out.println("New Period after adding days: " + newPeriod);
    }
}
