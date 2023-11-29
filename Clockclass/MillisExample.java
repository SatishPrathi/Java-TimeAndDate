import java.time.Clock;

public class MillisExample {
    public static void main(String[] args) {
        long currentMillis = Clock.systemDefaultZone().millis();
        System.out.println("Current milliseconds: " + currentMillis);
    }
}
