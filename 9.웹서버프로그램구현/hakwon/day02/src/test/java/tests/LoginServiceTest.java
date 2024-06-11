package tests;

import com.github.javafaker.Faker;
import global.exceptions.ValidationException;
import jakarta.servlet.http.HttpServletRequest;
import member.services.LoginService;
import member.validators.LoginValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

public class LoginServiceTest {
    private LoginService loginService;
    private HttpServletRequest request;
    private Faker faker ;

    @BeforeEach
    void init() {
        loginService = new LoginService(new LoginValidator());
        request = mock(HttpServletRequest.class);
        faker = new Faker();
    }

    @Test
    @DisplayName("로그인테스트")
    void test1() {
        given(request.getParameter("email")).willReturn(faker.internet().emailAddress());
        //given(request.getParameter("password")).willReturn(faker.regexify("\\w{8}"));
        loginService.process(request);
    }

    @Test
    @DisplayName("이메일 없이 로그인 -> 예외 발생")
    void test2() {
        assertThrows(ValidationException.class, () -> {
           loginService.process(request);
        });
    }

    @Test
    @DisplayName("이메일 없이 로그인 -> 예외 발생 메세지 출력")
    void test3() {
        ValidationException thrown = assertThrows(ValidationException.class, () -> {
            loginService.process(request);
        });
        assertTrue(!thrown.getMessage().contains("이메일"));
    }

}
