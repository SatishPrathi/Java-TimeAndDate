import java.time.OffsetTime;
import java.time.format.DateTimeFormatter;

public class FormatExample {
    public static void main(String[] args) {
        OffsetTime offsetTime = OffsetTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        String formattedTime = offsetTime.format(formatter);
        System.out.println("Formatted Time: " + formattedTime);
    }
}
