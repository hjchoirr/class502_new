package exam01;

import java.time.LocalDate;

public class Ex03 {
    public static void main(String[] args) {
        LocalDate toDay = LocalDate.now();
        System.out.println(toDay);

        // month : 1 ~ 12월
        LocalDate date = LocalDate.of(2023,5,8);
        System.out.println(date);


    }
}
