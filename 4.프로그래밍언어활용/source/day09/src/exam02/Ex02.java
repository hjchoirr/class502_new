package exam02;

public class Ex02 {
    public static void main(String[] args) {
        String s1 = "ABC"; //힙영역 - 문자열 상수 풀
        String s2 = "ABC"; //힙영역 - 문자열 상수 풀

        System.out.printf("s1 == s2 : %s%n", s1 == s2); //true 지만 equals()로 비교해야함
        System.out.printf("s1의 주소 : %s%n", System.identityHashCode(s1));
        System.out.printf("s2의 주소 : %s%n", System.identityHashCode(s2));
    }
}
