package member.services;

import global.validators.Validator;
import jakarta.servlet.http.HttpServletRequest;
import member.validators.LoginValidator;

public class LoginService {
    private Validator validator;

    public LoginService(LoginValidator validator) {
        this.validator = validator;
    }

    public void process(HttpServletRequest request) {

        validator.check(request);
    }
}
