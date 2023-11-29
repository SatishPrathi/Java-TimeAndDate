import java.time.LocalDate;

public class LocalDateExample10 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 11, 27);
        LocalDate futureMonth = date.plusMonths(1);
        System.out.println("Date 1 month later: " + futureMonth);
    }
}
