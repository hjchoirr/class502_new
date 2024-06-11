package member.services;
import global.validators.Validator;
import member.controllers.RequestJoin;
import member.validators.JoinValidator;

public class JoinService  {
    // 구성방식으로 .. 조립기..
    private Validator<RequestJoin> validator = new JoinValidator();

    // 생성자매개변수로 받아서 의존성 주입
    public JoinService(Validator<RequestJoin> validator) {
        this.validator = validator;
    }
    public void process(RequestJoin form) {
        validator.check(form);
    }
}
