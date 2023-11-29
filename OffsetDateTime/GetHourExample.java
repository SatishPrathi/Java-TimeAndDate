import java.time.OffsetDateTime;

public class GetHourExample {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();

        int hour = offsetDateTime.getHour();

        System.out.println("Hour of the day: " + hour);
    }
}
