package exam11;

public class Outer {
    int num1 = 10;
    static int num2 = 20;

    static class Inner {
        public void method() {
            System.out.println("정적 내부 클래스에서 메서드 호출");
        }
    }
}
