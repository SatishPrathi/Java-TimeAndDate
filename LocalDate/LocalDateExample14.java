import java.time.LocalDate;

public class LocalDateExample14 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 2, 15);
        int lengthOfMonth = date.lengthOfMonth();
        System.out.println("Length of Month: " + lengthOfMonth + " days");
    }
}
