import java.time.Instant;

public class OfEpochSecondExample {
    public static void main(String[] args) {
        long seconds = Instant.now().getEpochSecond();
        Instant instant = Instant.ofEpochSecond(seconds);

        System.out.println("Instant from Epoch Seconds: " + instant);
    }
}
