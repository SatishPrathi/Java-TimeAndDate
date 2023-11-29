import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

public class TickSecondsExample {
    public static void main(String[] args) {
        Clock tickSecondsClock = Clock.tickSeconds(ZoneId.systemDefault());
        Instant tickSecondsInstant = tickSecondsClock.instant();
        System.out.println("Current instant ticking in whole seconds: " + tickSecondsInstant);
    }
}
