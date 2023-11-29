import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeExample4 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(8, 45, 0);

        int hour = time.get(ChronoField.HOUR_OF_DAY);
        System.out.println("Hour of the day: " + hour);
    }
}
