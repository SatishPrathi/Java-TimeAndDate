import java.time.Clock;

public class EqualsExample {
    public static void main(String[] args) {
        Clock clock1 = Clock.systemDefaultZone();
        Clock clock2 = Clock.systemDefaultZone();
        boolean areEqual = clock1.equals(clock2);
        System.out.println("Are the clocks equal? " + areEqual);
    }
}
