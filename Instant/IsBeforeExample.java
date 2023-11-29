import java.time.Instant;

public class IsBeforeExample {
    public static void main(String[] args) {
        Instant instant1 = Instant.now();
        Instant instant2 = Instant.now().plusSeconds(3600); // 1 hour later

        boolean isBefore = instant1.isBefore(instant2);
        System.out.println("Is instant1 before instant2: " + isBefore);
    }
}
