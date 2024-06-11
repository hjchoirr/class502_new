package exam01;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Ex02 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> calc = (a, b) -> a+b;
        int result = calc.apply(10,20);
        System.out.println(result);
        /**
         * (참고) 지네릭 타입변수 T  : 참조자료형과 배열만 가능, 기본자료형은 불가능함
         * (문제점)
         * 1. 언박싱,오토박싱,언박싱 수행됨 : 성능저하, 연산은 기본형이 좋다
         * 2. 자료형 반복 정의
         */

        BinaryOperator<Integer> calc2 = (a, b) -> a + b;
        int result2 = calc2.apply(10,20);
        System.out.println(result2);
    }
}
