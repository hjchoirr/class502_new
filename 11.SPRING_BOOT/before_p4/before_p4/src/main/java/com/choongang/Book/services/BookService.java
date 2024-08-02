package com.choongang.Book.services;

import com.choongang.Book.controllers.RequestBook;
import com.choongang.Book.entities.Book;
import com.choongang.Book.repositories.AuthorRepository;
import com.choongang.Book.repositories.BookRepository;
import com.choongang.global.exceptions.CommonException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.View;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final View error;

    public void saveBook(RequestBook form) {
        Book book;
        if(form.getSeq() == null || form.getSeq().isBlank()) {  // 등록
            book = Book.builder()
                    .title(form.getTitle())
                    .author(authorRepository.findById(form.getAuthorCd()).orElse(null))
                    .publisher(form.getPublisher())
                    .pubYear(Integer.parseInt(form.getPubYear()))
                    .content(form.getContent())
                    .build();
        } else { // 수정
            book = Book.builder()
                    .bookSeq(Long.parseLong(form.getSeq()))
                    .title(form.getTitle())
                    .author(authorRepository.findById(form.getAuthorCd()).orElse(null))
                    .publisher(form.getPublisher())
                    .pubYear(Integer.parseInt(form.getPubYear()))
                    .content(form.getContent())
                    .build();
        }
        Book book2 = bookRepository.saveAndFlush(book);
        if(book2 == null) {
          throw new CommonException("등록 실패");
        }
    }
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteBookById(Long id) {
        if(bookRepository.existsById(id)) {
            bookRepository.deleteById(id);
        } else {
            throw new CommonException("해당 아이디에 대한 도서가 존재하지 않습니다.");
        }

    }
}
