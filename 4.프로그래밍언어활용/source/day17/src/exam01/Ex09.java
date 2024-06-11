package exam01;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class Ex09 {
    public static void main(String[] args) {
        ZonedDateTime zdt1 = ZonedDateTime.now();
        System.out.println(zdt1);  // 2024-05-08T16:33:02.088887200+09:00[Asia/Seoul]

        //ZoneId.getAvailableZoneIds().forEach(System.out::println);

        ZoneId london = ZoneId.of("Europe/London");
        ZonedDateTime londonZdt = zdt1.withZoneSameInstant(london);
        System.out.println(londonZdt); // 2024-05-08T08:33:02.088887200+01:00[Europe/London]

        ZonedDateTime newYorkZdt = zdt1.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println(newYorkZdt); //2024-05-08T03:33:02.088887200-04:00[America/New_York]

    }
}
