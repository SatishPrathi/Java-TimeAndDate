import java.time.Clock;

public class HashCodeExample {
    public static void main(String[] args) {
        int hashCode = Clock.systemDefaultZone().hashCode();
        System.out.println("Hash code of the default zone clock: " + hashCode);
    }
}
