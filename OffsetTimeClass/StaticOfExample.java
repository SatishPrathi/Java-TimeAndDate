import java.time.OffsetTime;
import java.time.ZoneOffset;

public class StaticOfExample {
    public static void main(String[] args) {
        OffsetTime customTime = OffsetTime.of(15, 30, 45, 500_000_000, ZoneOffset.ofHours(2));

        System.out.println("Custom Time: " + customTime);
    }
}
