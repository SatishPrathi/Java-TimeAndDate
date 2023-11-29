import java.time.LocalDate;

public class LocalDateExample16 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.ofYearDay(2023, 150);
        System.out.println("Date from Year and Day of Year: " + date);
    }
}
