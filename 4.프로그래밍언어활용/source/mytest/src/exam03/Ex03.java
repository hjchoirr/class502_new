package exam03;

public class Ex03 {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1 == str2);

        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        System.out.println("---------------");
        Integer num1 = new Integer(12345);
        Integer num2 = new Integer(12345);

        System.out.println(num1 == num2);
        System.out.println(num1.equals(num2));
        System.out.println(num1.hashCode());
        System.out.println(num2.hashCode());

    }
}
