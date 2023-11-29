import java.time.OffsetDateTime;

public class HashCodeExample {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();

        int hashCode = offsetDateTime.hashCode();

        System.out.println("Hash Code: " + hashCode);
    }
}
