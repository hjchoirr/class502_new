package exam01;

import config.AppCtx;
import member.controllers.RequestJoin;
import member.services.JoinService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppCtx.class)
public class Ex04 {

    @Autowired
    private JoinService joinService;

    @Test
    void test1() {
        RequestJoin form = new RequestJoin();
        form.setEmail("user99@test.com");
        form.setPassword("12345678");
        form.setConfirmPassword("12345678");
        form.setUserName("사용자99");
        form.setAgree(true);
        joinService.process(form);
    }
}
