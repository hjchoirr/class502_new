package exam01;

// T 는 Fruit의 하위클래스
public class Box<T extends Fruit & Eatable> { //Box<T> : 지네릭클래스 T:타입매개변수 Box: 원시타입
//public class Box<T extends Fruit> { //Box<T> : 지네릭클래스 T:타입매개변수 Box: 원시타입
    private T item;
    //private static T item2; // 안됨
    //private T[] nums = new T[3];  // 타입매개변수로 배열 못씀

    public void setItem(T item) {
        this.item = item;
    }
    public T getItem() {
        return item;
    }
    public String toString() {
        return item.get();
    }
}
