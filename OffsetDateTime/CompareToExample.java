import java.time.OffsetDateTime;

public class CompareToExample {
    public static void main(String[] args) {
        OffsetDateTime now = OffsetDateTime.now();
        OffsetDateTime future = now.plusDays(3);

        int result = now.compareTo(future);

        System.out.println("Comparison result: " + result);
    }
}
