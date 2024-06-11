package exam01;

import org.junit.jupiter.api.Test;

import java.sql.*;
import java.time.LocalDateTime;

public class Ex01 {
    @Test
    void test1() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String user = "STUDY";
        String password = "oracle";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            String sql = "Insert into member (user_no, user_id, user_pw, user_nm, mobile) values (seq_member.NEXTVAL, 'USER02', '123456', '사용자02','01055554444')";

            int cnt = stmt.executeUpdate(sql);
            System.out.println(cnt);
        }
        catch (SQLException e) {
                e.printStackTrace();
        }
    }
    @Test
    void test2() {
        //오라클 드라이버 동적 로딩
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }

        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String user = "STUDY";
        String password = "oracle";

        try (Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement()) {
            String keyword = "사용자";
            String sql = "select * from member where user_nm like '%" + keyword + "%'";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                long userNo = rs.getLong("user_no");
                String userId = rs.getString("user_id");
                String userPw = rs.getString("user_pw");
                String userNm = rs.getString("user_nm");
                String mobile = rs.getString("mobile");
                //Timestamp ts =  rs.getTimestamp("reg_dt");
                LocalDateTime regDt =  rs.getTimestamp("reg_dt").toLocalDateTime();

                System.out.printf("user_no : %d, user_id : %s, user_pw : %s, mobile : %s, regDt : %s%n", userNo, userId, userPw, mobile, regDt);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
