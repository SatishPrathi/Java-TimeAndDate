import java.time.OffsetTime;

public class IsBeforeExample {
    public static void main(String[] args) {
        OffsetTime currentTime = OffsetTime.now();
        OffsetTime earlierTime = OffsetTime.parse("08:00:00+00:00");

        boolean isBefore = currentTime.isBefore(earlierTime);

        System.out.println("Is current time before earlier time? " + isBefore);
    }
}
