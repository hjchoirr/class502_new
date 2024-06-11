package exam01;

public class Ex01 {
    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<Apple>(); // Box<Apple> appleBox = new Box<>();
        appleBox.setItem(new Apple());
        //appleBox.setItem(new Grape()); 에러 : 타입 안정성

        Apple apple = appleBox.getItem();
        System.out.println(apple.get());



    }
}
