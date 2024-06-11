package exam01;

public class B extends A {
    public void methodB() {
        System.out.println("B");
    }
    @Override
    public void methodA() {
        System.out.println("B-A");
    }
}
