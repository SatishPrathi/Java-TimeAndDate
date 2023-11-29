import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

public class TickMinutesExample {
    public static void main(String[] args) {
        Clock tickMinutesClock = Clock.tickMinutes(ZoneId.systemDefault());
        Instant tickMinutesInstant = tickMinutesClock.instant();
        System.out.println("Current instant ticking in whole minutes: " + tickMinutesInstant);
    }
}
