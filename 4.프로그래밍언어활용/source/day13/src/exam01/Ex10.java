package exam01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex10 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("이름1","이름2","이름3","이름4", "이름5");

        String max = Collections.max(names); //정렬후 마지막 요소
        String min = Collections.min(names); //정렬후 처음 요소

        System.out.printf("max=%s min=%s%n", max,min);

        Collections.shuffle(names);
        System.out.println(names);
        String max2 = Collections.max(names); //정렬후 마지막 요소
        String min2 = Collections.min(names); //정렬후 처음 요소

        System.out.printf("max=%s min=%s%n", max2,min2);
    }
}
