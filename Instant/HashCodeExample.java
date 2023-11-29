import java.time.Instant;

public class HashCodeExample {
    public static void main(String[] args) {
        Instant instant = Instant.now();

        int hashCode = instant.hashCode();
        System.out.println("Hash Code: " + hashCode);
    }
}
