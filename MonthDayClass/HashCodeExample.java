import java.time.MonthDay;

public class HashCodeExample {
    public static void main(String[] args) {
        MonthDay monthDay = MonthDay.of(2, 14);
        int hashCode = monthDay.hashCode();
        System.out.println("Hash Code: " + hashCode);
    }
}
