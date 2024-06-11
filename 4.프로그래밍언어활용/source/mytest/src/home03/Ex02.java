package home03;

public class Ex02 {
    public static void main(String[] args) {
        String s1 = new String("ABC");
        String s2 = "ABC";

        String s3 = s1.intern();
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s3));
    }
}
