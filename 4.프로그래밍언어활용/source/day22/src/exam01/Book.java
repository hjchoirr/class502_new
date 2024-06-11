package exam01;

import java.io.Serializable;

public class Book implements Serializable {

    private static final long serialVersionUID = 2L; // 직렬화 호환성 체크용
    private int isbn;
    private String title;
    private transient String author;  // transient :직렬화 배제
    private int price;



    public Book(int isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
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
