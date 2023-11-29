import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Locale;

public class DisplayNameExample {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("America/New_York");
        String displayName = zoneId.getDisplayName(TextStyle.FULL, Locale.getDefault());
        System.out.println("Display Name: " + displayName);
    }
}
