package config;

import exam01.Calculator;
import exam01.RecCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
//@EnableAspectJAutoProxy(proxyTargetClass = true) // 서브클래스 기반의 프록시
@EnableAspectJAutoProxy // AOP 자동설정 에너테이션 : 동적 프록시
public class AppCtx {

    @Bean
    public  ProxyCache proxyCache() {
        return new ProxyCache();
    }

    @Bean
    public ProxyCalculator2 proxyCalculator() {
        return new ProxyCalculator2();
    }

    @Bean
    public Calculator calculator() {
        return new RecCalculator();
    }
}
