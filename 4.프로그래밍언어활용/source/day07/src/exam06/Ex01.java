package exam06;

public class Ex01 {
    public static void main(String[] args) {
        Book book = new Book(1000, "제목1","저자1");
        System.out.println(book); // = System.out.println(book.toString());
        System.out.println(book.hashCode());

    }
}
