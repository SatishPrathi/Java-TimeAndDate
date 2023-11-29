import java.time.Period;

public class IsZeroExample {
    public static void main(String[] args) {
        Period zeroPeriod = Period.ZERO;
        System.out.println("Is zero? " + zeroPeriod.isZero());  // Should print true
    }
}
