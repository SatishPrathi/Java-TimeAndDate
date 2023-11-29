import java.time.Period;

public class NegatedExample {
    public static void main(String[] args) {
        Period period = Period.of(1, 2, 3);
        Period negatedPeriod = period.negated();
        System.out.println("Negated Period: " + negatedPeriod);
    }
}
