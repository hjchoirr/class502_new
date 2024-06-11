package exam03;

public class Box<T> {
    private T item;

    // Box가 객체가 될때 T 결정됨 - 지네릭 클래스
    public void method1(T str1, T str2) {

    }

    //지네릭 메서드 - 호출시에 T의 자료형이 결정된다
    public <T> void method2(T str1, T str2) {
    }
}
