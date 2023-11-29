import java.time.OffsetTime;

public class IsAfterExample {
    public static void main(String[] args) {
        OffsetTime currentTime = OffsetTime.now();
        OffsetTime laterTime = OffsetTime.parse("14:00:00+03:00");

        boolean isAfter = currentTime.isAfter(laterTime);

        System.out.println("Is current time after later time? " + isAfter);
    }
}
