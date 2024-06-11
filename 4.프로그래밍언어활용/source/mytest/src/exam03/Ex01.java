package exam03;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println(s1.toString());
        System.out.println(s1.equals(s2));

        System.out.println((s1.getClass().getName()));
    }
}
