package exam01;

import java.time.Duration;
import java.time.LocalTime;

public class Ex03 {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime endTime = LocalTime.of(17,50);

        Duration duration = Duration.between(now, endTime);
        System.out.println(duration);

        long sec = duration.getSeconds();
        LocalTime time = LocalTime.of(0,0,0);
        LocalTime time2 = time.plusSeconds(sec);

        int hours = time2.getHour();
        int mins = time2.getMinute();
        int secs = time2.getSecond();

        System.out.printf("수업종료까지 %d시간 %d분 %d초 남음", hours, mins, secs);
    }
}
