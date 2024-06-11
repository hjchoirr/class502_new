package hakwon03;

public class ExAB {

    public static void main(String[] args) {
        A b = new B();
        b.paint();
        //System.out.println();
        //b.draw();
        A a = new A();
        a.draw(); // StackOverflowError
    }
}
