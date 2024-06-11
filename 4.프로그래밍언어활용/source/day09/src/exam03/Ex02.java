package exam03;

public class Ex02 {
    public static void main(String[] args) {
        Integer num1 = new Integer(10);
        Integer num2 = new Integer(10);
        Integer num3 = Integer.valueOf(10);  // 자원낭비 방지위해 ( 단 작은 숫자에 한함 )
        Integer num4 = Integer.valueOf(10);

        Integer num5 = 10;
        Integer num6 = 10;

        System.out.printf("num1 주소 : %d%n", System.identityHashCode(num1));
        System.out.printf("num2 주소 : %d%n", System.identityHashCode(num2));

        System.out.printf("num3 주소 : %d%n", System.identityHashCode(num3));
        System.out.printf("num4 주소 : %d%n", System.identityHashCode(num4));

        System.out.printf("num5 주소 : %d%n", System.identityHashCode(num5));
        System.out.printf("num6 주소 : %d%n", System.identityHashCode(num6));

        num6.intValue();
    }
}
