import java.time.LocalDate;

public class LocalDateExample8 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 11, 27);
        LocalDate pastMonth = date.minusMonths(1);
        System.out.println("Date 1 month ago: " + pastMonth);
    }
}
