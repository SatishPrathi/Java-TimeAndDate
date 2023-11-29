import java.time.Instant;

public class OfEpochMilliExample {
    public static void main(String[] args) {
        long millis = System.currentTimeMillis();
        Instant instant = Instant.ofEpochMilli(millis);

        System.out.println("Instant from Epoch Milliseconds: " + instant);
    }
}
