package member.Validators;
import global.ValidationException;
import global.validators.RequiredValidator;
import global.validators.Validator;
import jakarta.servlet.http.HttpServletRequest;

public class LoginValidator implements Validator<HttpServletRequest>, RequiredValidator {
    @Override
    public void check(HttpServletRequest form) {
        String email = form.getParameter("email");
        String password = form.getParameter("password");

        checkRequired(email, new ValidationException("이메일을 입력하세요"));
        checkRequired(password, new ValidationException("비밀번호를 입력하세요"));
    }
}
