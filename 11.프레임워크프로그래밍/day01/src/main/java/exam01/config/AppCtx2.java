package exam01.config;

import exam01.member.dao.MemberDao;
import exam01.member.services.InfoService;
import exam01.member.services.JoinService;
import exam01.member.validators.JoinValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.format.DateTimeFormatter;

@Configuration
public class AppCtx2 {
    @Bean
    public MemberDao memberDao() {
        return new MemberDao();
    }

    @Bean
    public MemberDao memberDao2() {
        return new MemberDao();
    }

    @Bean
    public JoinValidator joinValidator() {
        return new JoinValidator();
    }
    @Bean
    public JoinService joinService() {
        return new JoinService(joinValidator(), memberDao());
    }

    @Bean
    public InfoService infoService() {
        return new InfoService();
    }

    @Bean //자바 JDK, 외부 라이브러리는 수동등록이 필수
    public DateTimeFormatter dateFormatter() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return formatter;
    }
}
