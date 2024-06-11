package tests;
import com.github.javafaker.Faker;
import global.ValidationException;
import jakarta.servlet.http.HttpServletRequest;
import member.Validators.LoginValidator;
import member.services.LoginService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

@DisplayName("로그인 서비스 기능 테스트")
public class LoginServiceTest {
    private LoginService loginService;
    private HttpServletRequest request;
    private Faker faker;

    @BeforeEach
    void init() {
        loginService = new LoginService(new LoginValidator());

        // mock HttpServletRequest 모의객체 생성
        request = mock(HttpServletRequest.class);
        faker = new Faker();
    }

    void setParamData(String name, String value)    {
        given(request.getParameter(name)).willReturn(value);
    }
    void setSuccessData() {

        String password = faker.regexify("\\w{8}").toLowerCase();
        setParamData("email", faker.internet().emailAddress());
        setParamData("password", password);
    }

    @Test
    @DisplayName("로그인 성공시 예외발생 없음")
    void successTest() {
        assertDoesNotThrow( ()-> {
            setSuccessData();
            loginService.process(request);
        });
    }

    @Test
    @DisplayName("필수항목(아이디, 비밀번호) 검증, 검증실패시 ValidationException 발생")
    void requiredFieldTest2() {

        //아이디 필수항목 검증 null, " "
        ValidationException thrown = assertThrows(ValidationException.class, () -> {
            //setParamData("email", faker.internet().emailAddress());
            //setParamData("password", "12345678");
           loginService.process(request);
        });

        String message = thrown.getMessage();
        System.out.println(message);
        assertTrue(message.contains("이메일"));
    }

    @Test
    @DisplayName("필수항목(아이디, 비밀번호) 검증, 검증실패시 ValidationException 발생")
    void requiredFieldTest() {

        assertAll(
                ()-> {
                    setParamData("email", faker.internet().emailAddress());
                    //setParamData("email", "  ");
                    requiredFieldEachTest("email", "이메일");
                }
                ,
                () -> {
                    setParamData("password", "12345678");
                    //setParamData("password", " ");
                    requiredFieldEachTest("password", "비밀번호");
                }

        );

    }

    void requiredFieldEachTest(String name, String message) {
        ValidationException thrown = assertThrows(ValidationException.class, () -> {
            loginService.process(request);

        });
        String msg = thrown.getMessage();
        System.out.println(msg);
        assertTrue(msg.contains(message), message + " 테스트");
    }

    @Test
    @DisplayName("이메일로 회원이 조회도니는지 검증, 검증실패시 ValidationException 발생")
    void memberExistTest() {

    }

    @Test
    @DisplayName("비밀번호 일치하는지 검증, 검증실패시 ValidationException 발생")
    void memberAuthTest() {

    }
}
