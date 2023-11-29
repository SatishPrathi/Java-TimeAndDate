import java.time.Period;
import java.time.temporal.TemporalUnit;
import java.util.List;

public class GetUnitsExample {
    public static void main(String[] args) {
        Period period = Period.of(1, 2, 3);
        List<TemporalUnit> units = period.getUnits();
        System.out.println("Units: " + units);
    }
}
