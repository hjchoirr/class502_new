package com.jmt502.api.member.controllers;

import com.jmt502.api.global.Utils;
import com.jmt502.api.global.exceptions.BadRequestException;
import com.jmt502.api.member.validators.JoinValidator;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class MemberController {

    private final JoinValidator joinValidator;
    private final Utils utils;

    @PostMapping
    public ResponseEntity join(@RequestBody @Valid RequestJoin form, Errors errors) {

        joinValidator.validate(form, errors);

        if(errors.hasErrors()) {
            throw new BadRequestException(utils.getErrorMessages(errors));
        }
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/token")
    public String token() {
        return "token";

    }
}
