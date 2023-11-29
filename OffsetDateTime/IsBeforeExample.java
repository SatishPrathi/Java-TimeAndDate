import java.time.OffsetDateTime;

public class IsBeforeExample {
    public static void main(String[] args) {
        OffsetDateTime now = OffsetDateTime.now();
        OffsetDateTime past = now.minusDays(3);

        boolean isBefore = now.isBefore(past);

        System.out.println("Is current date-time before the specified date-time? " + isBefore);
    }
}
