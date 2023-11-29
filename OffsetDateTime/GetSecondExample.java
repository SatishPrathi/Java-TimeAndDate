import java.time.OffsetDateTime;

public class GetSecondExample {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();

        int second = offsetDateTime.getSecond();

        System.out.println("Second of the minute: " + second);
    }
}
