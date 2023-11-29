import java.time.Clock;

public class SystemUTCExample {
    public static void main(String[] args) {
        Clock utcClock = Clock.systemUTC();
        System.out.println("UTC clock: " + utcClock);
    }
}
