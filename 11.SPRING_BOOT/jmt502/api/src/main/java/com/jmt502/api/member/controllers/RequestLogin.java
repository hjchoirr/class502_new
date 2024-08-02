package com.jmt502.api.member.controllers;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RequestLogin {
    @NotBlank
    private String email;

    @NotBlank
    private String password;

    private boolean success = true;

    private String code;
    private String defaultMessage;

    private String redirectUrl; // 로그인 성공시 이동할 주소
}