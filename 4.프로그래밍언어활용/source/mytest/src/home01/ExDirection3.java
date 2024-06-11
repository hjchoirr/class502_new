package home01;

public class ExDirection3 {
    public static void main(String[] args) {
        Direction2 d = Direction2.NORTH;
        System.out.printf("d.getVal(): %d d.getSymbol(): %s%n", d.getVal(), d.getSymbol());

        Direction2[] dArr = Direction2.values();
        for( Direction2 d1 : dArr) {
            System.out.printf("d1.name(): %s d1.val: %d d1.symbol: %s%n", d1.name(), d1.getVal(), d1.getSymbol());
        }
    }
}
