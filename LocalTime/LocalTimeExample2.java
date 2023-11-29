import java.time.LocalTime;

public class LocalTimeExample2 {
    public static void main(String[] args) {
        LocalTime time1 = LocalTime.of(12, 30, 45);
        LocalTime time2 = LocalTime.of(15, 45, 30);

        int comparison = time1.compareTo(time2);
        System.out.println("Comparison result: " + comparison);
    }
}
