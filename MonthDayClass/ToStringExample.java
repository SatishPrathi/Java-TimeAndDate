import java.time.MonthDay;

public class ToStringExample {
    public static void main(String[] args) {
        MonthDay monthDay = MonthDay.of(12, 25);
        String stringRepresentation = monthDay.toString();
        System.out.println("String Representation: " + stringRepresentation);
    }
}
