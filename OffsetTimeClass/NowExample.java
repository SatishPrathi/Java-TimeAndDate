import java.time.OffsetTime;

public class NowExample {
    public static void main(String[] args) {
        OffsetTime currentTime = OffsetTime.now();
        System.out.println("Current Time: " + currentTime);
    }
}
