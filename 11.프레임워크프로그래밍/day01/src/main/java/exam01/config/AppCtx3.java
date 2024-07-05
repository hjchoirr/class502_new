package exam01.config;

import exam01.member.dao.MemberDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "exam01.member") 아랫줄과 동일
@ComponentScan("exam01.member")
public class AppCtx3 {
    @Bean
    public MemberDao memberDao() {
        System.out.println("수동등록 Bean!");
        return new MemberDao();
    }
}
