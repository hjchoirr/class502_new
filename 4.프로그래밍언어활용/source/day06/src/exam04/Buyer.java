package exam04;

public interface Buyer {
    void buy();

    default void order() {
        System.out.println("바이어에서 주문");
        privateMethod();
    }
    private void privateMethod() {
    }
}
