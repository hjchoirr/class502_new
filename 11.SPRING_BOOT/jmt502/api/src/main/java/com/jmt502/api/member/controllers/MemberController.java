package com.jmt502.api.member.controllers;

import com.jmt502.api.global.Utils;
import com.jmt502.api.global.exceptions.BadRequestException;
import com.jmt502.api.global.rests.JSONData;
import com.jmt502.api.member.jwt.TokenProvider;
import com.jmt502.api.member.services.MemberSaveService;
import com.jmt502.api.member.validators.JoinValidator;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class MemberController {

    private final JoinValidator joinValidator;
    private final Utils utils;
    private final MemberSaveService saveService;
    private final TokenProvider tokenProvider;

    @PostMapping
    public ResponseEntity join(@RequestBody @Valid RequestJoin form, Errors errors) {

        System.out.println("---------403 ??? -------");
        joinValidator.validate(form, errors);
        saveService.save(form);


        if(errors.hasErrors()) {
            throw new BadRequestException(utils.getErrorMessages(errors));
        }
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping("/token")
    public JSONData token(@RequestBody @Valid RequestLogin form, Errors errors) {
        if(errors.hasErrors()) {
            throw new BadRequestException(utils.getErrorMessages(errors));
        }

        String token = tokenProvider.CreateToken(form.getEmail(), form.getPassword());
        return new JSONData(token);

    }
    @GetMapping("test1")
    public void memberOnly() {
        log.info("회원전용!!");
    }

    @PreAuthorize("hasAnyAuthority('ADMIN')")
    @GetMapping("/test2")
    public void adminOnly() {
        log.info("관리자 전용!!");
    }
}
