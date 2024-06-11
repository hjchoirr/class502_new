package exam01;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex11 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDateTime today2 = today.atTime(LocalTime.now());
        System.out.println(today2);
    }
}
