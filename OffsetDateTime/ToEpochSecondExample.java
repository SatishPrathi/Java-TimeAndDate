import java.time.OffsetDateTime;

public class ToEpochSecondExample {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();

        long epochSeconds = offsetDateTime.toEpochSecond();

        System.out.println("Epoch seconds: " + epochSeconds);
    }
}
