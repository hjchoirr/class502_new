package exam01;

public class Ex02 {
    public static void main(String[] args) {
        int num = 10;
        boolean r = num++ > 10 && (num = num + 10) > 15;
        System.out.println(r);
        System.out.println(num);

        int num1 = 10;
        boolean r1 = ++num1 > 10 && (num1 = num1 + 10) > 15;
        System.out.println(r1);
        System.out.println(num1);
    }
}
