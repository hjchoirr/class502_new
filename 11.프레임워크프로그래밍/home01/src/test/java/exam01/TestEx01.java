package exam01;

import exam01.config.AppCtx1;
import exam01.member.controllers.RequestJoin;
import exam01.member.services.InfoService;
import exam01.member.services.JoinService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;

public class TestEx01 {
    @Test
    void test1() {
        AnnotationConfigApplicationContext appCtx = new AnnotationConfigApplicationContext(AppCtx1.class);

        JoinService joinService = appCtx.getBean(JoinService.class);
        InfoService infoService = appCtx.getBean(InfoService.class);

        RequestJoin form = RequestJoin.builder()
                .email("user01@test.com")
                .password(("12345678"))
                .confirmPassword(("12345678"))
                .userName("사용자1")
                .regDt(LocalDateTime.now())
                .build();
        joinService.process(form);

        infoService.printMemberInfo();

        appCtx.close();
    }
}
