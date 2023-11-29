import java.time.OffsetDateTime;

public class GetYearExample {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();

        int year = offsetDateTime.getYear();

        System.out.println("Year: " + year);
    }
}
