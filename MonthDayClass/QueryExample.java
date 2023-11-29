import java.time.MonthDay;
import java.time.temporal.TemporalQueries;
import java.time.temporal.TemporalQuery;

public class QueryExample {
    public static void main(String[] args) {
        MonthDay monthDay = MonthDay.of(7, 8);
        String queryResult = monthDay.query(TemporalQueries.precision());
        System.out.println("Query Result: " + queryResult);
    }
}
