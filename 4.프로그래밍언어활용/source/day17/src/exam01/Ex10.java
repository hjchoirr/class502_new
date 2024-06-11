package exam01;
import java.time.LocalTime;

public class Ex10 {
    public static void main(String[] args) {
        LocalTime today = LocalTime.now();
        LocalTime time = LocalTime.of(23, 30,10);

        System.out.println(today);
        System.out.println(time);
    }
}
