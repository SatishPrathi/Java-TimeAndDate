import java.time.OffsetDateTime;

public class GetMonthExample {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();

        int monthValue = offsetDateTime.getMonthValue();

        System.out.println("Month of the year (as value): " + monthValue);
    }
}
