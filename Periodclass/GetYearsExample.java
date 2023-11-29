import java.time.Period;

public class GetYearsExample {
    public static void main(String[] args) {
        Period period = Period.of(2, 4, 6);
        int years = period.getYears();
        System.out.println("Years: " + years);
    }
}
