package com.choongang.Book.validators;

import com.choongang.Book.controllers.RequestBook;
import com.choongang.Book.entities.Author;
import com.choongang.Book.repositories.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
@RequiredArgsConstructor
public class RegBookValidator implements Validator {

    private final AuthorRepository authorRepository;

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.isAssignableFrom(RequestBook.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        if(errors.hasErrors()) {
            return;
        }

        RequestBook form = (RequestBook) target;
        String authorCd = form.getAuthorCd();
        String pubYear = form.getPubYear();

        // 작가 코드 있는지..
        Author author = authorRepository.findById(authorCd).orElse(null);
        if(author == null) {
            errors.rejectValue("authorCd", "NotFound.authorCd");
        }

        // pubYear 출판년도 체크
        try {
            Integer.parseInt(pubYear);

        }catch(NumberFormatException e) {
            errors.rejectValue("pubYear", "Invalid");
        }

    }
}
