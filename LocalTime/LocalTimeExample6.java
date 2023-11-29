import java.time.LocalTime;

public class LocalTimeExample6 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(10, 0, 0);

        LocalTime subtractedTime = time.minusMinutes(15);
        System.out.println("Subtracted Time: " + subtractedTime);
    }
}
