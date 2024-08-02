package com.choongang.Book.controllers;

import com.choongang.Book.entities.Author;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequestBook {

    private String seq;
    @NotBlank
    private String title;

    @NotBlank
    private String authorCd;

    @NotBlank
    private String publisher;

    @NotBlank
    private String pubYear;

    private String content;
}
