package exam01.config;

import exam01.member.dao.MemberDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.format.DateTimeFormatter;

@Configuration
//@ComponentScan(basePackages = "exam01.member") 아랫줄과 동일
@ComponentScan("exam01.member")
public class AppCtx3 {
    /*
    @Bean
    public MemberDao memberDao() {
        System.out.println("수동등록 Bean!");
        return new MemberDao();
    }
    */

    @Bean //자바 JDK, 외부 라이브러리는 수동등록이 필수
    public DateTimeFormatter dateFormatter() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return formatter;
    }
}
