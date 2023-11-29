import java.time.Year;

public class YearExample3 {
    public static void main(String[] args) {
        Year year1 = Year.of(2023);
        Year year2 = Year.of(2022);
        boolean isAfter = year1.isAfter(year2);
        System.out.println("Is year1 after year2? " + isAfter);
    }
}
