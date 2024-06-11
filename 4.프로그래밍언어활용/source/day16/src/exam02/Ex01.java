package exam02;
import java.util.Date;

public class Ex01 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        int year = date.getYear();
        int month = date.getMonth(); // 0 ~ 11

        System.out.printf("year=%d month=%d%n", year, month);

        long epochTime = date.getTime(); //1970.01.01 자정부터 1000분의 1초 단위
        System.out.println(epochTime);
    }
}
