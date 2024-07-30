package com.choongang.book;

import com.choongang.Book.entities.Author;
import com.choongang.Book.entities.Book;
import com.choongang.Book.repositories.AuthorRepository;
import com.choongang.Book.repositories.BookRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.IntStream;

@SpringBootTest
@ActiveProfiles("test")
@Transactional
public class Ex01 {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;

    @BeforeEach
    public void init() {
        Author author = Author.builder().authorCd("A0001")
                .authorName("작가01")
                .build();
        authorRepository.saveAndFlush(author);


        List<Book> books = IntStream.rangeClosed(1, 10).mapToObj(i -> Book.builder()
                .author(author)
                .title("책제목" + i)
                .publisher("출판사" + i)
                .pubYear(2010 + i)
                .content("책내용" + i)
                .build()).toList();

        bookRepository.saveAllAndFlush(books);
    }
    @Test
    void test1() {
        bookRepository.findAll().forEach(item -> System.out.println(item.getCreatedAt()
                + " : " + item.getTitle() + " : " + item.getAuthor().getAuthorCd() + " : " + item.getAuthor().getAuthorName() + " : " + item.getPubYear()));

    }
}
