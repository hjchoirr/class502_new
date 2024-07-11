package org.choongang.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.apache.tomcat.jdbc.pool.DataSource;

@Configuration
@EnableTransactionManagement
@MapperScan("org.choongang")
public class DBConfig {
    @Bean(destroyMethod = "close")
    public DataSource dataSource()  {
        DataSource ds = new DataSource();
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
        ds.setUsername("SPRING");
        ds.setPassword("oracle");
        ds.setInitialSize(2);
        ds.setMaxActive(10);
        ds.setTestWhileIdle(true);
        ds.setMinEvictableIdleTimeMillis(60 * 1000); // default 60 sec
        ds.setTimeBetweenEvictionRunsMillis(5 * 1000); // default 5 sec
        return ds;
    }

    @Bean
    public JdbcTemplate jdbcTemplate()  {   // 마이바티스만 쓸땐 이거 필요 없음
        return new JdbcTemplate(dataSource());
    }
    @Bean
    public PlatformTransactionManager transactionManager()  {
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {  // 마이바티스 쓸때 필요함
        SqlSessionFactoryBean sqlsessionFactoryBean = new SqlSessionFactoryBean();
        sqlsessionFactoryBean.setDataSource(dataSource());
        return sqlsessionFactoryBean.getObject();
    }
}
