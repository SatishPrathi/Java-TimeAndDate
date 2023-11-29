import java.time.Clock;

public class SystemDefaultZoneExample {
    public static void main(String[] args) {
        Clock defaultZoneClock = Clock.systemDefaultZone();
        System.out.println("Default zone clock: " + defaultZoneClock);
    }
}
