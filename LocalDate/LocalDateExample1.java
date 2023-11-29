import java.time.*;

public class LocalDateExample1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 11, 27);
        LocalDateTime dateTime = date.atTime(15, 30);
        System.out.println("Combined Date and Time: " + dateTime);
    }
}
