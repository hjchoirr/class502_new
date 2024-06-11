package exam01;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Ex02 {
    private String url = "jdbc:oracle:thin:@localhost:1521:XE";
    private String user = "STUDY";
    private String password = "oracle";

    @BeforeAll
    static void init() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    void test1() {
        String keyword = "사용자";
        String sql = "select * from member where user_nm like ?";
        try(Connection conn = DriverManager.getConnection(url, user,password);
            PreparedStatement psmt = conn.prepareStatement(sql)) {
            psmt.setString(1, "%" + keyword + "%");
            ResultSet rs = psmt.executeQuery();

            List<Member> members = new ArrayList<>();
            while(rs.next()) {
                long userNo = rs.getLong("user_no");
                String userId = rs.getString("user_id");
                String userPw = rs.getString("user_pw");
                String userNm = rs.getString("user_nm");
                String mobile = rs.getString("mobile");

                LocalDateTime regDt =  rs.getTimestamp("reg_dt").toLocalDateTime();

                Member member = new Member();
                /*
                member.setUserNo(userNo);
                member.setUserId(userId);
                member.setUserId(userPw);
                member.setUserId(userNm);
                member.setUserId(mobile);
                member.setRegDt(regDt);
                members.add(member);
                */
                //System.out.printf("user_no : %d, user_id : %s, user_pw : %s, mobile : %s, regDt : %s%n", userNo, userId, userPw, mobile, regDt);

            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    @Test
    void test2() {
        String userId = "USER04";
        String userNm = "사용자04";
        String userPw = "123456";
        String mobile = "0101112222";

        String sql = "insert into member(user_no, user_id, user_nm, user_pw, mobile) values (seq_member.nextval, ?, ?, ?, ?)";

        try(Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = conn.prepareStatement(sql, new String[] {"user_no"})) {
            pstmt.setString(1, userId);
            pstmt.setString(2, userNm);
            pstmt.setString(3, userPw);
            pstmt.setString(4, mobile);

            int cnt = pstmt.executeUpdate();
            System.out.println(cnt);

            // sequence next val 로 만들어진 member 테이블의 기본키의 새로 생성된 데이터 받아오기
            ResultSet rs = pstmt.getGeneratedKeys();
            if(rs.next()) {
                long userNo = rs.getLong(1);
                System.out.printf("user_no : %d%n", userNo);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }

    }
}
