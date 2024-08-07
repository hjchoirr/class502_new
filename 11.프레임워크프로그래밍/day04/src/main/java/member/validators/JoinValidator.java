package member.validators;

import global.exceptions.BadRequestException;
import global.validators.RequiredValidator;
import global.validators.Validator;
import lombok.RequiredArgsConstructor;
import mappers.member.MemberMapper;
import member.controllers.RequestJoin;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class JoinValidator implements Validator<RequestJoin>, RequiredValidator {

    private final MemberMapper mapper;

    @Override
    public void check(RequestJoin form) {
        /**
         * 1. 필수항목 검증(email, password, confirmPassword, userName, agree
         * 2. 이메일 중복 여부 ( 회원 기가입 여부 )
         * 3. 비밀번호 자리수 체크 8자리
         * 4. 비밀번호와 비밀번호 확인 일치여부
         */

        String email = form.getEmail();
        String password = form.getPassword();
        String confirmPassword = form.getConfirmPassword();
        String userName = form.getUserName();
        boolean agree = form.isAgree();

        checkRequired(email, new BadRequestException("이메일을 입력하세요."));
        checkRequired(password, new BadRequestException("비밀번호를 입력하세요."));
        checkRequired(confirmPassword, new BadRequestException("비밀번호확인을 입력하세요"));
        checkRequired(userName, new BadRequestException("회원명을 입력하세요"));
        checkTrue(agree, new BadRequestException("약관에 동의하세요."));


        checkTrue(mapper.exists(email) == 0L, new BadRequestException("이미 가입된 이메일입니다."));
        checkTrue(password.length() >= 8L, new BadRequestException("비밀번호는 8자리 이상 입력하세요"));

        checkTrue(password.equals(confirmPassword), new BadRequestException("비밀번호가 일치하지 않습니다."));

    }
}
