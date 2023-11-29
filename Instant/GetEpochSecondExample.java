import java.time.Instant;

public class GetEpochSecondExample {
    public static void main(String[] args) {
        Instant instant = Instant.now();

        long epochSecond = instant.getEpochSecond();
        System.out.println("Epoch Second: " + epochSecond);
    }
}
