package exam01;

import java.util.Optional;

public class Ex09 {
    public static void main(String[] args) {
        Book book = null;

        //System.out.println(book.toString());  //NPE 발생
        Optional<Book> opt = Optional.ofNullable(book);

        Book book2 = opt.orElseGet(() -> new Book());
        Book book3 = opt.orElseGet(Book::new); //윗줄과 동일

        System.out.println(book2.toString());

    }
}
