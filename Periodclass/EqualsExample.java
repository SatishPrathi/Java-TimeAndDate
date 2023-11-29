import java.time.Period;

public class EqualsExample {
    public static void main(String[] args) {
        Period period1 = Period.of(1, 2, 3);
        Period period2 = Period.of(1, 2, 3);
        System.out.println("Are periods equal? " + period1.equals(period2));  // Should print true
    }
}
