import java.time.*;

public class LocalTimeExample10 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(12, 30, 0);

        LocalTime addedTime = time.plusMinutes(45);
        System.out.println("Added Time: " + addedTime);
    }
}
