import java.time.Period;

public class GetMonthsExample {
    public static void main(String[] args) {
        Period period = Period.of(0, 6, 0);
        int months = period.getMonths();
        System.out.println("Months: " + months);
    }
}
