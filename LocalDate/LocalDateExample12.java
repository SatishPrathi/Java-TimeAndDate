import java.time.LocalDate;

public class LocalDateExample12 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 11, 27);
        int dayOfYear = date.getDayOfYear();
        System.out.println("Day of Year: " + dayOfYear);
    }
}
