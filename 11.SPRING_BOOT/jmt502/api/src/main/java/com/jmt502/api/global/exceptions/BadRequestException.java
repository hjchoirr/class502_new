package com.jmt502.api.global.exceptions;

import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.Map;

public class BadRequestException extends CommonException{

    public BadRequestException(String message) {
        super(message, HttpStatus.BAD_REQUEST);

    }
    public BadRequestException(Map<String, List<String>> errMessage) {
        super("", HttpStatus.BAD_REQUEST);
        setErrorMessages(errMessage);
    }
}
