package exam01;

import java.util.HashSet;

public class Ex06 {
    public static void main(String[] args) {
        HashSet<Book> books = new HashSet<>();
        books.add(new Book(1000, "책1", "저자1"));
        books.add(new Book(1000, "책1", "저자1"));
        books.add(new Book(2000, "책2", "저자2"));
        books.add(new Book(3000, "책3", "저자3"));
        books.add(new Book(4000, "책4", "저자4"));
        books.add(new Book(5000, "책5", "저자5"));

        System.out.println(books);

        for(Book book: books) {
            System.out.println(book);
        }
    }
}
