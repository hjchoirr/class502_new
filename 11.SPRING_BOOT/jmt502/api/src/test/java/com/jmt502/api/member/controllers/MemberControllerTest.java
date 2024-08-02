package com.jmt502.api.member.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest
@ActiveProfiles("test")
@AutoConfigureMockMvc
public class MemberControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper om;

    @Test
    @DisplayName("회원가입테스트")
    void joinTest() throws Exception{
        RequestJoin form = new RequestJoin();
        //form.setEmail("user01@test.com");
        form.setPassword("_aA123456");
        form.setConfirmPassword("_aA123456");
        form.setUserName("사용자01");
        form.setMobile("010-000-1111");
        form.setAgree(true);
        String params = om.writeValueAsString(form);

        mockMvc.perform(post("/account")
                .contentType(MediaType.APPLICATION_JSON)
                .characterEncoding(Charset.forName("UTF-8"))
                .content(params))
                .andDo(print());
    }
}
