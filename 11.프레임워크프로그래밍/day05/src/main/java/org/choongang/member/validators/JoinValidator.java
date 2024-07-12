package org.choongang.member.validators;


import lombok.RequiredArgsConstructor;
import org.choongang.global.exceptions.BadRequestException;
import org.choongang.global.validators.RequiredValidator;
import org.choongang.global.validators.Validator;
import org.choongang.member.controllers.RequestJoin;
import org.choongang.member.mappers.MemberMapper;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
@RequiredArgsConstructor
public class JoinValidator implements Validator<RequestJoin>, RequiredValidator {
//public class JoinValidator implements Validator {

    private final MemberMapper mapper;
/*
    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.isAssignableFrom(RequestJoin.class); // 검증을 RequestJoin 으로 한정
    }

    @Override
    public void validate(Object target, Errors errors) {

    }

 */
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
