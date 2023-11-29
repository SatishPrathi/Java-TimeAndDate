import java.time.*;
import java.time.format.DateTimeFormatter;

public class FormatExample {
    public static void main(String[] args) {
        MonthDay monthDay = MonthDay.of(12, 3);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd");
        String formattedDate = monthDay.format(formatter);
        System.out.println("Formatted Date: " + formattedDate);
    }
}
