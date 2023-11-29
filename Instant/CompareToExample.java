import java.time.Instant;

public class CompareToExample {
    public static void main(String[] args) {
        Instant instant1 = Instant.now();
        Instant instant2 = Instant.now().plusSeconds(3600); // 1 hour later

        int comparisonResult = instant1.compareTo(instant2);
        System.out.println("Comparison Result: " + comparisonResult);
    }
}
