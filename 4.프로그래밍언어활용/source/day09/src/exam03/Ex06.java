package exam03;

public class Ex06 {
    public static void main(String[] args) {
        Integer num1 = 100;  // Integer.valueOf(100); 자동추가 오토박싱
        Integer num2 = 200;

        Integer num3 = num1 + num2; //내부적으로 Integer.valueOf(num1.intValue()) + Integer.valueOf(num2.intValue());
        double num5 = num1.doubleValue();
    }
}
