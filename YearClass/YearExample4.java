import java.time.Year;

public class YearExample4 {
    public static void main(String[] args) {
        Year year1 = Year.of(2023);
        Year year2 = Year.of(2024);
        boolean isBefore = year1.isBefore(year2);
        System.out.println("Is year1 before year2? " + isBefore);
    }
}
