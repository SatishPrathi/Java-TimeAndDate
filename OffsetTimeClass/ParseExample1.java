import java.time.OffsetTime;
import java.time.format.DateTimeFormatter;

public class ParseExample1 {
    public static void main(String[] args) {
        String timeString = "16:45:30+05:30";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ssXXX");

        OffsetTime parsedTime = OffsetTime.parse(timeString, formatter);

        System.out.println("Parsed Time: " + parsedTime);
    }
}
