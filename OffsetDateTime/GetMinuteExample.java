import java.time.OffsetDateTime;

public class GetMinuteExample {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();

        int minute = offsetDateTime.getMinute();

        System.out.println("Minute of the hour: " + minute);
    }
}
