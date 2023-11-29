import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeExample3 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(18, 15, 30);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        String formattedTime = time.format(formatter);
        System.out.println("Formatted Time: " + formattedTime);
    }
}
