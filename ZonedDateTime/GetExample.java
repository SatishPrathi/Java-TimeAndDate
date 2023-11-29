import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;

public class GetExample {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        int year = zonedDateTime.get(ChronoField.YEAR);
        System.out.println("Year: " + year);
    }
}
