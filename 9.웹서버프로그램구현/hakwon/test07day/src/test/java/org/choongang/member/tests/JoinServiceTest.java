package org.choongang.member.tests;


import com.github.javafaker.Faker;
import org.choongang.member.controllers.RequestJoin;
import org.choongang.member.services.JoinService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Locale;

public class JoinServiceTest {
    private JoinService service;
    private Faker faker ;

    @BeforeEach
    void init() {
        //session = DBConn.getSqlSession();
        faker = new Faker(Locale.ENGLISH);

    }
    RequestJoin getData() {
        RequestJoin form = RequestJoin.builder()
                .email(faker.internet().emailAddress())
                .userName(faker.name().fullName())
                .password(faker.regexify("\\w{8,12}"))
                .termsAgree(true)
                .build();
        form.setConfirmPassword(form.getPassword());
        return form;
    }
    @Test
    @DisplayName("성공테스트")
    void successTest() {
        service.process(getData());
    }

}
