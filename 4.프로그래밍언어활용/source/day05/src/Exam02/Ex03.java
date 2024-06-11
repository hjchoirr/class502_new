package Exam02;

public class Ex03 {
    public static void main(String[] args) {
        C c = new C();
        B b = new B();
        System.out.println(c instanceof C);
        System.out.println(c instanceof B);
        System.out.println(c instanceof A);
        System.out.println(b instanceof C);
    }
}
