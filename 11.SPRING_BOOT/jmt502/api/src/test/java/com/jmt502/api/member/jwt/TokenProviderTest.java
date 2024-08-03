package com.jmt502.api.member.jwt;

import com.jmt502.api.member.controllers.RequestJoin;
import com.jmt502.api.member.services.MemberSaveService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class TokenProviderTest {
    @Autowired
    private TokenProvider tokenProvider;

    @Autowired
    private MemberSaveService memberSaveService;

    private RequestJoin form;

    @BeforeEach
    void init() {
        form = new RequestJoin();
        form.setEmail("user02@test.com");
        form.setPassword("_aA123456");
        form.setConfirmPassword("_aA123456");
        form.setMobile("010-000-1111");
        form.setUserName("사용자01");
        form.setAgree(true);

        memberSaveService.save(form);

    }

    @Test
    @WithMockUser(username = "user02@test.com", password="_aA123456", authorities = "USER")
    void createTokenTest() {
        String token = tokenProvider.CreateToken("user02@test.com", "_aA123456");
        System.out.println("token=" + token);

    }
}
