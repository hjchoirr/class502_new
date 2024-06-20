package org.choongang.member.tests;

import com.github.javafaker.Faker;
import org.choongang.member.controllers.RequestJoin;
import org.choongang.member.entities.Member;
import org.choongang.member.mapper.MemberMapper;
import org.choongang.member.services.JoinService;
import org.choongang.member.services.MemberServiceProvider;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

public class JoinServiceTest2 {

    private JoinService service;
    private Faker faker;
    private MemberMapper memberMapper;

    @BeforeEach
    void init() {
        service = MemberServiceProvider.getInstance().joinService();
        memberMapper = MemberServiceProvider.getInstance().memberMapper();
    }

    public RequestJoin getData() {
        faker = new Faker(Locale.ENGLISH);
        RequestJoin form = RequestJoin.builder()
                .email(System.currentTimeMillis() + faker.internet().emailAddress())
                .password(faker.regexify("\\w{8}").toLowerCase())
                .userName(faker.name().fullName())
                .termsAgree(true)
                .build();
        form.setConfirmPassword(form.getPassword());
        return form;
    }
    @Test
    @DisplayName("회원가입테스트")
    void test() {
        RequestJoin form = getData();

        service.process(form);
        String email = form.getEmail();

        Member member = memberMapper.get(email);
        System.out.println(member.getEmail());
        System.out.println(form.getEmail());
        assertEquals(member.getEmail(), form.getEmail());
    }

}
