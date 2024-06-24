package exam01;

import java.time.LocalDateTime;

public class Member {
    private String userId;
    private String email;
    private LocalDateTime regDt;

    public final String str = "ABC";
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getRegDt() {
        return regDt;
    }

    public void setRegDt(LocalDateTime regDt) {
        this.regDt = regDt;
    }

    public void myMethod(String str) {

    }
    @Override
    public String toString() {
        return "Member{" +
                "userId='" + userId + '\'' +
                ", email='" + email + '\'' +
                ", regDt=" + regDt + '\'' +
                '}';
    }

}
