package exam01;

import java.util.Calendar;

public class Ex02 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, 30); // 100일 후
        printDate(cal);

        Calendar cal2 = Calendar.getInstance();
        cal2.roll(Calendar.MONTH, 30); // 100일 후
        printDate(cal2);


    }
    public static void printDate(Calendar cal) {
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);  // 0 ~ 11
        int day = cal.get(Calendar.DAY_OF_MONTH);

        System.out.printf("year=%d month=%d day=%d%n", year, month + 1, day);
    }

}
