import java.time.LocalTime;

public class LocalTimeExample9 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(9, 0, 0);

        LocalTime addedTime = time.plusHours(2);
        System.out.println("Added Time: " + addedTime);
    }
}
