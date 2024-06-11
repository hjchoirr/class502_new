package homework;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Ex01 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        LocalDate sdate = LocalDate.of(today.getYear(), today.getMonth(), 1);

        int yoil = sdate.getDayOfWeek().getValue(); // 1(월) ~ 7(일)
        System.out.println(yoil);

        LocalDate eDate = sdate.plusMonths(1).minus(1, ChronoUnit.DAYS);
        System.out.println(eDate);
    }
}
