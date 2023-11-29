import java.time.OffsetDateTime;

public class ParseExample {
    public static void main(String[] args) {
        String text = "2023-07-20T15:45:30+03:00";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(text);

        System.out.println("Parsed OffsetDateTime: " + offsetDateTime);
    }
}
