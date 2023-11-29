import java.time.OffsetTime;

public class IsEqualExample {
    public static void main(String[] args) {
        OffsetTime time1 = OffsetTime.parse("12:30:00+03:00");
        OffsetTime time2 = OffsetTime.parse("12:30:00+03:00");

        boolean isEqual = time1.isEqual(time2);

        System.out.println("Are the two times equal? " + isEqual);
    }
}
