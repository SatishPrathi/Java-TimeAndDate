import java.time.Period;

public class MinusExample {
    public static void main(String[] args) {
        Period period1 = Period.of(2, 3, 4);
        Period period2 = Period.of(1, 1, 1);
        Period result = period1.minus(period2);
        System.out.println("Result after subtraction: " + result);
    }
}
