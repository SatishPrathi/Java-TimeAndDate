import java.time.Instant;
import java.time.LocalTime;

public class WithExample {
    public static void main(String[] args) {
        Instant instant = Instant.now();

        Instant startOfDay = instant.with(LocalTime.MIN);
        System.out.println("Start of the day: " + startOfDay);
    }
}
