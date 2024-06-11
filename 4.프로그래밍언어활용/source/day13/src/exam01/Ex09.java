package exam01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex09 {
    public static void main(String[] args) {
        List<String> chars = Arrays.asList("aa", "bb","cc","aa","aa");

        int cnt = Collections.frequency(chars, "aa");
        System.out.println(cnt);
    }
}
