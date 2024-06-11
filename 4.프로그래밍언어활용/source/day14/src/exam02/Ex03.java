package exam02;

import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        /**
         * 문자열 앞뒤에 *
         * 대문자로 변환
         * 출력
         */
        String[] fruits = { "apple", "orange", "mango", "melon"};
        //Arrays.stream(fruits).map(s->"*" + s + "*").map(s-> s.toUpperCase());
        Arrays.stream(fruits).map(s->"*" + s + "*")
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
