package exam01;

import com.github.javafaker.Faker;
import global.Mailer;
import jakarta.servlet.http.HttpServletRequest;
import member.Validators.LoginValidator;
import member.services.LoginService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.only;

@ExtendWith(MockitoExtension.class)
public class Ex02Test {
    private LoginService loginservice ;
    @Mock
    private  Mailer mailer;
    private Faker faker;
    @Mock
    private HttpServletRequest request;

    @BeforeEach
    void init() {
        loginservice = new LoginService(new LoginValidator());
        //mailer = mock(Mailer.class);

        faker = new Faker(Locale.ENGLISH);
        //request = mock(HttpServletRequest.class);

        //스텁추가
        given(request.getParameter("email")).willReturn(faker.internet().emailAddress());
        given(request.getParameter("password")).willReturn(faker.regexify("\\w{8}").toLowerCase());
    }

    @Test
    void test1() {
        loginservice.setMailer(mailer);
        loginservice.process(request);
        String email = request.getParameter("email");
        then(mailer).should(only()).send(email); // send 함수가 loginService.process 메서드에서 한번이상 호출되는지 체크

    }

    @Test
    void test2() {
        loginservice.setMailer(mailer);
        loginservice.process(request);

        String email = request.getParameter("email");
        System.out.println(email);
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        then(mailer).should().send(captor.capture());

        String usedEmail = captor.getValue();  //send() 메서드에서 매개변수에 사용한 값 확인 위해
        System.out.println("이메일" + usedEmail);

        assertTrue(email.contains(usedEmail));
    }


}
