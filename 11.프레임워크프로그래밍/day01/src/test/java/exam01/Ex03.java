package exam01;

import exam01.config.AppCtx;
import exam01.config.AppCtx2;
import exam01.member.controllers.RequestJoin;
import exam01.member.services.InfoService;
import exam01.member.services.JoinService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;

public class Ex03 {
    @Test
    void test1() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx2.class);

        JoinService joinService = ctx.getBean(JoinService.class);
        InfoService infoService = ctx.getBean(InfoService.class);

        RequestJoin form = RequestJoin.builder()
            .email("user01@test.com")
            .password("12345678")
            .confirmPassword("12345678")
            .userName("사용자01")
            .build();

        joinService.process(form);
        infoService.printList(); //DAO를 직접쓰지말고 이렇게..
        ctx.close();
    }
    @Test
    void test2() {
        /*
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class, AppCtx2.class);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("exam01.config");
        */
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        //AppCtx2.class
        JoinService joinService = ctx.getBean(JoinService.class);
        InfoService infoService = ctx.getBean(InfoService.class);

        RequestJoin form = RequestJoin.builder()
                .email("user01@test.com")
                .password("12345678")
                .confirmPassword("12345678")
                .userName("사용자01")
                .RegDt(LocalDateTime.now())
                .build();

        joinService.process(form);
        infoService.printList(); //DAO를 직접쓰지말고 이렇게..

        //AppCtx.class
        Greeter g1 = ctx.getBean(Greeter.class);
        g1.hello("이이름");

        ctx.close();
    }
}
