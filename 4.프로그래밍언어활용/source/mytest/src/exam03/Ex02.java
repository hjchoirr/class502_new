package exam03;

public class Ex02 {
    public static void main(String[] args) {
        String str = "test";
        String str1 = new String("test");
        System.out.println(str1);
        System.out.println(str.equals(str));
        System.out.println(str1 == str);

        Integer num = new Integer(100);
        Integer num1 = 100;
        System.out.println(num1);
        System.out.println(num.equals(num1));

        System.out.println(num1 == num);
    }
}
