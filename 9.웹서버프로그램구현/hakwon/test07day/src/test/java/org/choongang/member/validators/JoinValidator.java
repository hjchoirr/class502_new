package org.choongang.member.validators;

import org.choongang.global.exceptions.BadRequestException;
import org.choongang.global.validators.RequiredValidator;
import org.choongang.global.validators.Validator;
import org.choongang.member.controllers.RequestJoin;

public class JoinValidator implements Validator<RequestJoin>, RequiredValidator {
    @Override
    public void check(RequestJoin form) {
        checkRequired(form.getEmail(), new BadRequestException("이메일을 입력하세요"));
        checkRequired(form.getPassword(), new BadRequestException("비밀번로를 입력하세요"));
    }
}
