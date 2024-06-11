package exam01;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Ex08 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        LocalDate theDay = today.plus(150, ChronoUnit.DAYS);
        LocalDate theDay2 = today.minus(150, ChronoUnit.DAYS);
        System.out.println("오늘 : " + today);
        System.out.println("150일 후 : " + theDay);
        System.out.println("150일 전 : " + theDay2);
    }
}
