import java.time.Instant;

public class IsAfterExample {
    public static void main(String[] args) {
        Instant instant1 = Instant.now();
        Instant instant2 = Instant.now().minusSeconds(3600); // 1 hour earlier

        boolean isAfter = instant1.isAfter(instant2);
        System.out.println("Is instant1 after instant2: " + isAfter);
    }
}
