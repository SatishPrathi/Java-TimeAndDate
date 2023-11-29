import java.time.MonthDay;

public class IsAfterExample {
    public static void main(String[] args) {
        MonthDay firstDate = MonthDay.of(4, 30);
        MonthDay secondDate = MonthDay.of(2, 15);
        boolean isAfter = firstDate.isAfter(secondDate);
        System.out.println("Is After: " + isAfter);
    }
}
