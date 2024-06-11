package exam06;

import java.util.Objects;

public class Book extends java.lang.Object{
    private int isbn;
    private String title;
    private String author;

    public Book(int isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("isbn=%d, tite=%s, author=%s%n", this.isbn, this.title, this.author);
    }
}
