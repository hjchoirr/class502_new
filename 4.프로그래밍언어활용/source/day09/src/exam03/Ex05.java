package exam03;

public class Ex05 {
    public static void main(String[] args) {
        int num1 = 100;
        Integer num2 = Integer.valueOf(200);

        int result = num1 + num2;  //num2.intValue(); 자동추가됨, 원래는 숫자와 객체는 연산이 안됨
        System.out.println(result);

        Integer num3 = Integer.valueOf(100);
        Integer num4 = Integer.valueOf(200);

        int result2 = num3 + num4; // num3.intValue() + num4.initValue()  언박싱
        System.out.println(result2);

    }
}
