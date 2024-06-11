package exam05;

public class Ex01 {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<Apple>();  // Apple type으로 한정함
        appleBox.setItem(new Apple());
        //appleBox.setItem(new Grape());  // 이건 안됨 => Object 형을 사용하지 않고 T에 Apple 명시했으므로

        Apple apple = appleBox.getItem();
        System.out.println(apple.get());
    }
}
