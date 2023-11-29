import java.time.Period;

public class NormalizedExample {
    public static void main(String[] args) {
        Period period = Period.of(1, 15, 30);
        Period normalizedPeriod = period.normalized();
        System.out.println("Normalized Period: " + normalizedPeriod);
    }
}
