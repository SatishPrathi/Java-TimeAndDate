import java.time.OffsetDateTime;

public class NowMethodExample {
    public static void main(String[] args) {
        OffsetDateTime currentDateTime = OffsetDateTime.now();

        System.out.println("Current date-time: " + currentDateTime);
    }
}
