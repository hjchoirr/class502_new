package exam01;


import java.util.Objects;

public class Book extends Object{
    private int isbn;
    private String title;
    private String author;

    public Book(int isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Book) {
            Book book = (Book)obj;
            if(isbn == book.isbn && title.equals(book.title) && author.equals(book.author)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title, author); // Objects => util 패키지의 Object 편의기능
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
