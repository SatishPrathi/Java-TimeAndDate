import java.time.*;

public class LocalDateExample9 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 11, 27);
        LocalDate futureDate = date.plusDays(7);
        System.out.println("Date 7 days later: " + futureDate);
    }
}
