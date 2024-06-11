package exam02;

public abstract class Car {
    public abstract void start();
    public abstract void press();
    public abstract void turnoff();

    public void run() {   // 절차 정의하는 매서드 -> 템플릿 매서드 패턴
        start();
        press();
        turnoff();
    }
}
