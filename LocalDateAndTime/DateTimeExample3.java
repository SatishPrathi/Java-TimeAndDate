import java.time.LocalDateTime;

public class DateTimeExample3 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        LocalDateTime newDateTime = dateTime.minusDays(5);

        System.out.println("Original DateTime: " + dateTime);
        System.out.println("DateTime minus 5 days: " + newDateTime);
    }
}
