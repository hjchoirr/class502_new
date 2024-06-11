package tests;

import global.exceptions.ValidationException;
import member.controllers.RequestJoin;
import member.services.JoinService;
import member.validators.JoinValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("회원가입기능테스트")
public class JoinServiceTest {
     private JoinService joinService;


     @BeforeEach
     void init() {
          joinService = new JoinService(new JoinValidator());
     }
     RequestJoin getData() {
          return RequestJoin.builder()
                  .email("test" + System.currentTimeMillis() + "@test.org")
                  .password("12345678")
                  .confirmPassword("12345678")
                  .userName("사용자")
                  .termsAgree(true)
                  .build();
     }

     @Test
     @DisplayName("회원가입성공시 예외가 발생하지 않음")
     void successTest() {
          assertDoesNotThrow(()-> {
               joinService.process(getData());
          });
     }
     @Test
     @DisplayName("필수항목체크(이메일, 비번, 비번확인, 회원명)-검증 실패시 ValidationException 발생")
     void requiredFieldTest() {
          assertAll(
                  () -> {
                       RequestJoin form = getData();
                       form.setEmail(null);
                       requiredFieldEachTest(form, "이메일");
                       form.setEmail("   ");
                       requiredFieldEachTest(form, "이메일");
                  },
                  () -> {
                       RequestJoin form = getData();
                       //form.setPassword(null);
                       form.setUserName(null);
                       requiredFieldEachTest(form, "암호");
                       form.setPassword("  ");
                       requiredFieldEachTest(form, "암호");
                  },
                  () -> {
                      RequestJoin form = getData();
                      form.setConfirmPassword(null);
                      requiredFieldEachTest(form, "암호확인");
                      form.setConfirmPassword("  ");
                      requiredFieldEachTest(form, "암호확인");
                  },
                  () -> {
                       RequestJoin form = getData();
                       form.setUserName(null);
                       requiredFieldEachTest(form, "이름");
                       form.setUserName("  ");
                       requiredFieldEachTest(form, "이름");
                  },
                  //약관동의 검증
                  () -> {
                       //System.out.println("유입!");
                       RequestJoin form = getData();
                       form.setTermsAgree(false);
                       requiredFieldEachTest(form, "약관에 동의");
                  }
          );
     }

     void requiredFieldEachTest(RequestJoin form, String keyword){
         ValidationException thrown = assertThrows(ValidationException.class, () -> {
               joinService.process(form);
          },keyword + " 오류-1 !");
         String message = thrown.getMessage();
         assertTrue(message.contains(keyword), keyword + " 오류-2 !");
     }
     @Test
     @DisplayName("비밀번호와 비밀번호 확인 일치테스트, 검증실패시 ValidationException 발생")
     void passwordMatchTest() {

     }
     @Test
     @DisplayName("이메일 중복여부 테스트, 검증실패시 DuplicatedMemberException 발생")
     void duplicateEmailTest() {

     }
     @Test
     @DisplayName("회원가입 완료 후 실제 데이터베이스에서 조회되는 지 검증")
     void memberExistsTest() {
          //가입처리

          //getData()로 생성한 테이터의 email항목으로 DB조회
          //조회한 회원데이터 이메일과 getData()로 생성된 이메일이 일치하는지 체크
          //assertEquals(...)

     }

}
