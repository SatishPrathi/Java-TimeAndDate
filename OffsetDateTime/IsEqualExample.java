import java.time.OffsetDateTime;

public class IsEqualExample {
    public static void main(String[] args) {
        OffsetDateTime now1 = OffsetDateTime.now();
        OffsetDateTime now2 = OffsetDateTime.now();

        boolean isEqual = now1.isEqual(now2);

        System.out.println("Are the two OffsetDateTime instances equal? " + isEqual);
    }
}
