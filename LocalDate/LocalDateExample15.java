import java.time.LocalDate;

public class LocalDateExample15 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 2, 15);
        int lengthOfYear = date.lengthOfYear();
        System.out.println("Length of Year: " + lengthOfYear + " days");
    }
}
