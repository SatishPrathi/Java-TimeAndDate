import java.time.Period;

public class GetDaysExample {
    public static void main(String[] args) {
        Period period = Period.of(0, 0, 5);
        int days = period.getDays();
        System.out.println("Days: " + days);
    }
}
