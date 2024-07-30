package com.choongang.Book.exceptions;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException() {
        super("데이터를 찾을 수 없습니다.");
    }
}
