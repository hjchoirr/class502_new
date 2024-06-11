package exam05;

public class Box<T> { // T : Type,자료형
    private T item;

    public T getItem() {
        return item;
    }
    public void setItem(T item) {
        this.item = item;
    }
}
