import java.time.Period;

public class MultipliedByExample {
    public static void main(String[] args) {
        Period period = Period.of(1, 2, 3);
        Period multipliedPeriod = period.multipliedBy(2);
        System.out.println("Multiplied Period: " + multipliedPeriod);
    }
}
