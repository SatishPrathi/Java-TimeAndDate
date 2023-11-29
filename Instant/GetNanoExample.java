import java.time.Instant;

public class GetNanoExample {
    public static void main(String[] args) {
        Instant instant = Instant.now();

        int nanoOfSecond = instant.getNano();
        System.out.println("Nanoseconds: " + nanoOfSecond);
    }
}
