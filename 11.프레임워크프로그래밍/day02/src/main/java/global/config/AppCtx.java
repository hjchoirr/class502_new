package global.config;

import board.services.BoardService2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.time.format.DateTimeFormatter;

@Configuration
/*
@ComponentScan(
basePackages="member",
excludeFilters = @ComponentScan.Filter(type= FilterType.ANNOTATION, classes = ManualBean.class))  // ManualBean 에노테이션 붙어있는거 배제
 */
/*
@ComponentScan(
basePackages="member",
excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {MemberDao.class, JoinService.class}))
 */
/*
@ComponentScan(
basePackages="member",
excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX,pattern = "member\\.w+Dao"))
 */
/*
@ComponentScan(
basePackages={"member","board"},
excludeFilters = @ComponentScan.Filter(type = FilterType.ASPECTJ, pattern="member.*Dao"))
 */
@ComponentScan(basePackages={"member","board"})
public class AppCtx {

    @Scope("prototype")
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BoardService2 boardService2() {
        return new BoardService2();
    }

    @Bean
    public DateTimeFormatter formatter() {
        return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    }
}
