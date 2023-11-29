import java.time.Period;
import java.time.chrono.IsoChronology;

public class GetChronologyExample {
    public static void main(String[] args) {
        Period period = Period.of(1, 2, 3);
        IsoChronology chronology = period.getChronology();
        System.out.println("Chronology: " + chronology);
    }
}
