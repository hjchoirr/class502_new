package org.choongang.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.apache.tomcat.jdbc.pool.DataSource;
@Slf4j
@Configuration
@EnableTransactionManagement
@MapperScan("org.choongang")
@EnableJdbcRepositories("org.choongang")
public class DBConfig extends AbstractJdbcConfiguration {
    @Bean(destroyMethod = "close")
    public DataSource dataSource()  {
        log.info("---org 프로파일---");

        DataSource ds = new DataSource();
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
        //ds.setUsername("SPRING");
        //ds.setPassword("oracle");
        ds.setUsername(System.getenv("db.username"));
        ds.setPassword(System.getenv("db.password"));
        ds.setInitialSize(2);
        ds.setMaxActive(10);
        ds.setMaxIdle(10);
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

    @Bean
    public NamedParameterJdbcOperations namedParameterJdbcTemplate(DataSource dataSource)  {
        return new NamedParameterJdbcTemplate(dataSource);
    }
}
