import java.time.MonthDay;

public class GetMonthValue{
    public static void main(String[] args) {
        MonthDay monthDay = MonthDay.of(8, 5);
        int monthValue = monthDay.getMonthValue();
        System.out.println("Month Value: " + monthValue);
    }
}
