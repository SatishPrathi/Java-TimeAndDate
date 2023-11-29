import java.time.ZoneId;

public class SystemDefaultExample {
    public static void main(String[] args) {
        ZoneId systemDefaultZone = ZoneId.systemDefault();
        System.out.println("System Default Zone: " + systemDefaultZone);
    }
}
