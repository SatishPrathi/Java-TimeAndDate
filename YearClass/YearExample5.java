import java.time.Year;

public class YearExample5 {
    public static void main(String[] args) {
        Year leapYear = Year.of(2024);
        boolean isLeap = leapYear.isLeap();
        System.out.println("Is 2024 a leap year? " + isLeap);
    }
}
