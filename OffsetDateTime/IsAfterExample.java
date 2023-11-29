import java.time.OffsetDateTime;

public class IsAfterExample {
    public static void main(String[] args) {
        OffsetDateTime now = OffsetDateTime.now();
        OffsetDateTime future = now.plusDays(3);

        boolean isAfter = now.isAfter(future);

        System.out.println("Is current date-time after the specified date-time? " + isAfter);
    }
}
