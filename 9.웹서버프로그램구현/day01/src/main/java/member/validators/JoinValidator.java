package member.validators;
import global.exceptions.ValidationException;
import global.validators.RequiredValidator;
import global.validators.Validator;
import member.controllers.RequestJoin;

public class JoinValidator implements Validator<RequestJoin>, RequiredValidator {

    @Override
    public void check(RequestJoin form) {
        String email = form.getEmail();
        String password = form.getPassword();
        String confirmPassword = form.getConfirmPassword();
        String userName = form.getUserName();
        boolean termsAgree = form.isTermsAgree();

        checkRequired(email, new ValidationException("이메일을 입력하세요."));
        checkRequired(password, new ValidationException("암호를 입력하세요."));
        checkRequired(confirmPassword, new ValidationException("암호확인을 입력하세요."));
        checkRequired(userName, new ValidationException("이름을 입력하세요."));
        checkTrue(termsAgree, new ValidationException("약관에 동의하세요"));


    }
}
