package exam01;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class Ex12 {
    public static void main(String[] args) {
        OffsetDateTime odt1 = OffsetDateTime.now();
        ZoneOffset london = ZoneOffset.of("+0");

        OffsetDateTime londonOdt = odt1.withOffsetSameInstant(london);
        System.out.println(londonOdt); // 2024-05-08T07:29:24.755041500Z
    }
}
