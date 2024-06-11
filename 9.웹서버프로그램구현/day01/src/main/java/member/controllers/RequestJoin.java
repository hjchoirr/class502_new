package member.controllers;
import lombok.Builder;
import lombok.Data;

@Data   // getter, setter, toString equals 자동추가
@Builder
public class RequestJoin {
    private String email;
    private String password;
    private String confirmPassword;
    private String userName;
    private boolean termsAgree; //약관동의여부
}



