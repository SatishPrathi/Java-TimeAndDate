import java.time.Period;

public class PlusExample {
    public static void main(String[] args) {
        Period period1 = Period.of(1, 2, 3);
        Period period2 = Period.of(2, 3, 4);
        Period result = period1.plus(period2);
        System.out.println("Result after addition: " + result);
    }
}
