package org.choongang.member.validators;

import lombok.RequiredArgsConstructor;
import org.choongang.member.controllers.RequestLogin;
import org.choongang.member.entities.Member;
import org.choongang.member.mappers.MemberMapper;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
@RequiredArgsConstructor
public class LoginValidator implements Validator {

    private final MemberMapper mapper;

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.isAssignableFrom(RequestLogin.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        RequestLogin form = (RequestLogin) target;

        String email = form.getEmail();
        String password = form.getPassword();

        if(StringUtils.hasText(email)) {
            Member member = mapper.get(email);
            if(member == null) {
                //errors.rejectValue("password", "Check.emailPassword");
                errors.reject("Check.emailPassword");
            }

            if(member != null && StringUtils.hasText(password) && !BCrypt.checkpw(password, member.getPassword())) {
                    //errors.rejectValue("password", "Check.emailPassword");
                    errors.reject("Check.emailPassword");

                }
            }


        }



    }

