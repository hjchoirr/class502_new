package config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class AppCtx {

    @Bean(destroyMethod = "close")
    public DataSource dataSource() {
        DataSource ds = new DataSource();
        ds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUsername("SPRING");
        ds.setPassword("oracle");

        ds.setTestWhileIdle(true); //유휴 객체 유효성 체크
        //ds.setInitialSize(2);
        //ds.setMaxActive(10);
        //ds.setTimeBetweenEvictionRunsMillis(10 * 1000); //10초마다 연결 상태 체크
        //ds.setMinEvictableIdleTimeMillis(60 * 1000); //유휴객체 생존시간

        return ds;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }
}
