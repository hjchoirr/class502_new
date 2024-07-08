package exam01;

import board.services.BoardService;
import board.services.BoardService2;
import global.config.AppCtx;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex02 {
    @Test
    void test1() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        BoardService service = ctx.getBean(BoardService.class);
        service.write();

        ctx.close();
    }
    @Test
    void test2() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        BoardService2 s1 = ctx.getBean(BoardService2.class);
        BoardService2 s2 = ctx.getBean(BoardService2.class);

        System.out.println(s1 == s2);
        ctx.close();
    }
}
