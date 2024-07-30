package com.choongang.Book.controllers;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RequestAuthor {
    @NotBlank
    private String authorCd;
    @NotBlank
    private String authorName;
}
