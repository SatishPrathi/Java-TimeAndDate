import java.time.OffsetDateTime;

public class GetMonthValueExample {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();

        int monthValue = offsetDateTime.getMonthValue();

        System.out.println("Month of the year (from 1 to 12): " + monthValue);
    }
}
