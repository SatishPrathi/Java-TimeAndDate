import java.time.Instant;

public class EqualsExample {
    public static void main(String[] args) {
        Instant instant1 = Instant.now();
        Instant instant2 = Instant.now();

        boolean areEqual = instant1.equals(instant2);
        System.out.println("Are Instants equal: " + areEqual);
    }
}
