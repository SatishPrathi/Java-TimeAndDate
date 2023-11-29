import java.time.Instant;

public class ToStringExample {
    public static void main(String[] args) {
        Instant instant = Instant.now();

        String instantString = instant.toString();
        System.out.println("Instant as String: " + instantString);
    }
}
