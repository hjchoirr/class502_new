package com.choongang.Book.controllers;

import com.choongang.Book.entities.Author;
import com.choongang.Book.entities.Book;
import com.choongang.Book.repositories.AuthorRepository;
import com.choongang.Book.services.BookService;
import com.choongang.Book.validators.RegBookValidator;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@RequiredArgsConstructor
@RequestMapping("/book")
public class BookController {

    private final AuthorRepository authorRepository;
    private final BookService bookService;
    private final RegBookValidator regBookValidator;

    @ModelAttribute("authors")
    public Map<String, Author> authors() {
        Map<String, Author> authors = authorRepository.findAll().stream()
                .collect(Collectors.toMap(a -> a.getAuthorCd(), a -> a));
        System.out.println(authors);
        return authors;
    }

    @GetMapping({"/regbook", "/regbook/{seq}"})
    public String regbook(@ModelAttribute RequestBook form, @PathVariable(name="seq", required = false) String seq, Model model) {

        System.out.println("seq: " + seq);
        if(seq == null) {
            form.setAuthorCd(make_author());
            return "front/book/regbook";
        }

        Book book = bookService.getBookById(Long.parseLong(seq));
        System.out.println(book);
        form = RequestBook.builder()
                .seq(book.getBookSeq().toString())
                .title(book.getTitle())
                .authorCd(book.getAuthor().getAuthorCd())
                .publisher(book.getPublisher())
                .pubYear(Integer.toString(book.getPubYear()))
                .content(book.getContent())
                .build();

        model.addAttribute("requestBook", form);

        return "front/book/regbook";
    }

    @PostMapping("/regbook")
    public String regbook(@Valid RequestBook form, Errors errors) {

        regBookValidator.validate(form, errors);

        if (errors.hasErrors()) {
            System.out.println("regbook - errors.hasErrors() = " + errors.hasErrors());
            return "front/book/regbook";
        }
        bookService.saveBook(form);
        return "redirect:/book/list";
    }

    @GetMapping("/list")
    public String list(Model model) {

        List<Book> books = bookService.getAllBooks();

        model.addAttribute("books", books);
        return "front/book/list";
    }

    @GetMapping("/delete/{seq}")
    public String delete(@PathVariable(name="seq") String seq, Model model) {
        System.out.println("delete: " + seq);

        bookService.deleteBookById(Long.parseLong(seq));
        return list(model);
    }


    //테스트 용 작가 데이터 없으면 만들기
    public String make_author() {

        Author author = authorRepository.findById("A0001").orElse(null);
        if (author == null) {
            author = Author.builder().authorCd("A0001")
                    .authorName("작가01")
                    .build();
            authorRepository.saveAndFlush(author);
        }
        return author.getAuthorCd();
    }
}
