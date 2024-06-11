package exam01;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ex03 {
    private String url = "jdbc:oracle:thin:@localhost:1521:XE";
    private String user = "STUDY";
    private String password = "oracle";

    @BeforeAll
    static void init() {
        try {
            //오라클 드라이버 동적 로딩
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    void test1() {
        String sql = "CALL Register_member(?, ?, ?, ?)";
        try(Connection conn = DriverManager.getConnection(url, user, password);
            CallableStatement cstmt = conn.prepareCall(sql)) {
            cstmt.setString(1, "USER06");
            cstmt.setString(2,"12234");
            cstmt.setString(3, "사용자06");
            cstmt.setString(4, "01088899999");
            int cnt = cstmt.executeUpdate();
            System.out.println(cnt);

        }catch(SQLException e) {
            e.printStackTrace();
        }

    }
    @Test
    void test2() {
        DataSource ds = new DataSource();
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
        ds.setUsername("STUDY");
        ds.setPassword("oracle");

        ds.setInitialSize(2);  //초기 로드 생성 연결 객체 수 - 기본값 10
        ds.setMaxActive(10); // 최대 생성할 연결객체 수 - 기본값 100
        ds.setTestWhileIdle(true); // 연결객체가 유휴 상태일때 연결상태 체크
        ds.setTimeBetweenEvictionRunsMillis(5 * 1000); //5초에 한번씩 연결상태 체크
        ds.setMinEvictableIdleTimeMillis(30 * 1000); //유휴상태 객체를 30초후 소멸 후 새로 생성

        try(Connection conn = ds.getConnection()) {
            System.out.println(conn);
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    @Test
    void test3() {
        HikariConfig config = new HikariConfig();
        config.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        config.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:XE");
        config.setUsername("STUDY");
        config.setPassword("oracle");

        config.setMinimumIdle(2);
        config.setMaximumPoolSize(10);

        HikariDataSource ds = new HikariDataSource(config);
        try(Connection cnn = ds.getConnection()) {
            System.out.println(cnn);
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

}
