package exam01;

import java.time.Instant;
import java.time.Period;

public class Ex01 {
    public static void main(String[] args) {
        Instant today = Instant.now();
        System.out.println(today);
        long time1 = today.getEpochSecond(); //초단위 timestamp
        long time2 = today.toEpochMilli(); //밀리세컨즈 EpochTime

        System.out.printf("time1=%d time2=%d%n", time1, time2);
    }
}
