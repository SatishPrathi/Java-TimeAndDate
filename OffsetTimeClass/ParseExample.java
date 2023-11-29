import java.time.OffsetTime;
import java.time.format.DateTimeFormatter;

public class ParseExample {
    public static void main(String[] args) {
        String timeString = "10:30:00+05:30";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ssXXX");

        OffsetTime parsedTime = OffsetTime.parse(timeString, formatter);

        System.out.println("Parsed Time: " + parsedTime);
    }
}
