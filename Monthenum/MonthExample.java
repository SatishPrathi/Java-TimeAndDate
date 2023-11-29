public class MonthExample {
    public enum Month {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }

    public static void main(String[] args) {
        Month currentMonth = Month.NOVEMBER;

        switch (currentMonth) {
            case JANUARY:
                System.out.println("It's January!");
                break;
            case FEBRUARY:
                System.out.println("It's February!");
                break;
            case NOVEMBER:
                System.out.println("It's November!");
                break;
            default:
                System.out.println("It's a month not handled explicitly.");
        }
    }
}
