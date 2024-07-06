package exam01.member.validators;

import exam01.member.controllers.RequestJoin;
import exam01.member.global.validators.Validator;
import org.springframework.stereotype.Component;

@Component
public class JoinValidator implements Validator<RequestJoin> {

    @Override
    public void check(RequestJoin form) {

    }
}
