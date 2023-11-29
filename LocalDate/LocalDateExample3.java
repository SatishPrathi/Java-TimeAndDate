import java.time.LocalDate;

public class LocalDateExample3 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2023, 11, 27);
        LocalDate date2 = LocalDate.of(2023, 11, 27);
        boolean isEqual = date1.equals(date2);
        System.out.println("Are the dates equal? " + isEqual);
    }
}
