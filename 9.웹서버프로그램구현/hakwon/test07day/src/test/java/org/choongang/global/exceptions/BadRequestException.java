package org.choongang.global.exceptions;

public class BadRequestException extends CommonException{
    public BadRequestException(String message) {
        super(message);
    }

    public BadRequestException() {
        this("잘못된 요청입니다.");
    }
}
