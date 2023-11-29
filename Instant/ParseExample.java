import java.time.Instant;

public class ParseExample {
    public static void main(String[] args) {
        String instantString = "2023-01-01T12:00:00Z";
        Instant parsedInstant = Instant.parse(instantString);
        System.out.println("Parsed Instant: " + parsedInstant);
    }
}
