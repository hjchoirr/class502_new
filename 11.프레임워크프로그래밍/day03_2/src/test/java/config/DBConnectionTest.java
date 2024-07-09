package config;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;  // tomcat DataSource 는 javax.sql 의 하위 클래스임
import java.sql.Connection;
import java.sql.SQLException;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppCtx.class)
public class DBConnectionTest {
    @Autowired
    private DataSource dataSource;

    @Test
    void test1() throws SQLException {
        Connection conn = dataSource.getConnection();
        System.out.println(conn);
    }
}
