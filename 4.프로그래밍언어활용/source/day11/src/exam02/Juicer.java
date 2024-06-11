package exam02;

import java.util.ArrayList;

public class Juicer {
    public static void make(FruitBox<? extends Fruit> box) {
        // ? - Fruit, Apple, Grape  Fruit 부터 하위 클래스 가능
        ArrayList<?> fruits = box.getItems();
        System.out.println(fruits);
    }
    public static <T extends Fruit> void make3(FruitBox<T> box) {

    }

    // ? - Apple, Fruit, Object
    public static void make2(FruitBox<? super Apple> box) {
        //Apple부터 상위 클래스 가능
        ArrayList<?> fruits = box.getItems();
        System.out.println(fruits);
    }


}
