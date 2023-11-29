import java.time.LocalDate;

public class LocalDateExample6 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 2, 29);
        boolean isLeapYear = date.isLeapYear();
        System.out.println("Is it a leap year? " + isLeapYear);
    }
}
