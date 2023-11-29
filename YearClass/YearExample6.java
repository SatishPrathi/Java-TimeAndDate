import java.time.Year;

public class YearExample6 {
    public static void main(String[] args) {
        Year year = Year.of(2023);
        int lengthOfYear = year.length();
        System.out.println("Length of the year: " + lengthOfYear + " days");
    }
}
