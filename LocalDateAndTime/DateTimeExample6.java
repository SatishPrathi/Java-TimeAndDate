import java.time.LocalDateTime;

public class DateTimeExample6 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        LocalDateTime newDateTime = dateTime.plusDays(7);

        System.out.println("Original DateTime: " + dateTime);
        System.out.println("DateTime plus 7 days: " + newDateTime);
    }
}
