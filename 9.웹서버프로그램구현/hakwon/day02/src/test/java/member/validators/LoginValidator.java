package member.validators;

import global.exceptions.ValidationException;
import global.validators.Validator;
import jakarta.servlet.http.HttpServletRequest;

public class LoginValidator implements Validator<HttpServletRequest>, RequiredValidation {


    @Override
    public void check(HttpServletRequest request) {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        checkRequired(email, "이메일을 입력하세요");
        checkRequired(password, "비밀번호를 입력하세요");

    }
}
