import java.time.Period;

public class OfExample {
    public static void main(String[] args) {
        Period period = Period.of(3, 6, 9);
        System.out.println("Period: " + period);
    }
}
