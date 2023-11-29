import java.time.*;

public class DateTimeExample7 {
    public static void main(String[] args) {
        LocalDateTime dateTime1 = LocalDateTime.now();
        LocalDateTime dateTime2 = LocalDateTime.of(2023, 1, 1, 12, 0);

        boolean isEqual = dateTime1.equals(dateTime2);

        System.out.println("Are DateTime1 and DateTime2 equal? " + isEqual);
    }
}
