package exam01;

public class Ex01 {
    public static void main(String[] args) {

        Book b1 = new Book(1000, "책1", "저자");

        System.out.println(b1);  //b1.toString() 을 자바가 자동으로 Object.toString() 붙여주는 것

        System.out.println(b1.getClass());
        System.out.println(b1.getClass().getName());
        System.out.println(b1.getClass().getPackage());
        System.out.println(b1.getClass().getPackageName());

    }
}
