import java.time.LocalTime;

public class LocalTimeExample5 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(14, 30, 0);

        LocalTime subtractedTime = time.minusHours(3);
        System.out.println("Subtracted Time: " + subtractedTime);
    }
}
