package exam01;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Ex05 {
    public static void main(String[] args) {
        //Set<Book> books = new TreeSet<>();
        Set<Book> books = new TreeSet<>(Comparator.reverseOrder());

        books.add(new Book(1000,"책1","저자1"));
        books.add(new Book(1001,"책2","저자2"));
        books.add(new Book(1001,"책3","저자3"));
        books.add(new Book(1002,"책4","저자4"));
        books.add(new Book(1003,"책5","저자5"));
        books.add(new Book(1004,"책6","저자6"));

        books.forEach(System.out::println);
    }
}
