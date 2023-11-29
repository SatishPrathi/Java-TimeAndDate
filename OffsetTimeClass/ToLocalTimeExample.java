import java.time.OffsetTime;
import java.time.LocalTime;

public class ToLocalTimeExample {
    public static void main(String[] args) {
        OffsetTime offsetTime = OffsetTime.now();
        LocalTime localTime = offsetTime.toLocalTime();

        System.out.println("Local Time: " + localTime);
    }
}
