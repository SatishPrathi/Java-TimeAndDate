import java.time.*;

public class IsValidYear {
    public static void main(String[] args) {
        MonthDay monthDay = MonthDay.of(12, 3);
        boolean isValid = monthDay.isValidYear(2023);
        System.out.println("Is Valid Year: " + isValid);
    }
}
