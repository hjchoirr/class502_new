package home04;

public class Ex02 {
    public static void main(String[] args) {
        String str1 = "Programming";
        String str2 = "Programming";

        String str3 = new String("Programming");

        System.out.println(str1 == str2);  //true
        System.out.println(str1 == str3);  //false

        System.out.println(str1.equals(str2));  //true
        System.out.println(str2.equals(str3));  //

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
    }
}
