import java.time.LocalDate;

public class LocalDateExample7 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 11, 27);
        LocalDate pastDate = date.minusDays(7);
        System.out.println("Date 7 days ago: " + pastDate);
    }
}
