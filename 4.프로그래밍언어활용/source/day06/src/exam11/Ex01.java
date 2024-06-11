package exam11;

public class Ex01 {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        inner.method();
        //System.out.println(num1);
        System.out.println(Outer.num2);
    }
}
