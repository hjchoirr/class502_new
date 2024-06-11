package member.services;

import global.Mailer;
import global.validators.Validator;
import jakarta.servlet.http.HttpServletRequest;

public class LoginService {

    private Validator<HttpServletRequest> validator;
    private Mailer mailer;

    public LoginService(Validator<HttpServletRequest> validator) {
        this.validator = validator;
    }
    public void setMailer(Mailer mailer) {
        this.mailer = mailer;
    }

    public void process(HttpServletRequest request) {
        //아이디 : email, 비밀번로 password
        System.out.println(request.getParameter("email"));
        System.out.println(request.getParameter("password"));
        validator.check(request);

        //로그인 성공 가정
        //성공시 메일 전송

        if(mailer != null) {
            String email = request.getParameter("email");

            mailer.send(email);
            //mailer.send(email);
        }
    }
}
