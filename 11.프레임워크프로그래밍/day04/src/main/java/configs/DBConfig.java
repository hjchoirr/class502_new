package configs;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@MapperScan("mappers")
@EnableTransactionManagement
public class DBConfig {

    @Bean(destroyMethod = "close")
    public DataSource dataSource() {
        DataSource ds = new DataSource();
        ds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUsername("SPRING");
        ds.setPassword("oracle");

        ds.setTestWhileIdle(true); //유휴 객체 유효성 체크
        ds.setInitialSize(2);
        ds.setMaxActive(10);
        ds.setTimeBetweenEvictionRunsMillis(10 * 1000); //10초마다 연결 상태 체크
        ds.setMinEvictableIdleTimeMillis(60 * 1000); //유휴객체 생존시간

        return ds;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }

    @Bean
    public PlatformTransactionManager transactionManager() {
        DataSourceTransactionManager tm = new DataSourceTransactionManager();
        tm.setDataSource(dataSource());
        return tm;
    }
    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());

        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBean.getObject();
        return sqlSessionFactory;
    }

}
