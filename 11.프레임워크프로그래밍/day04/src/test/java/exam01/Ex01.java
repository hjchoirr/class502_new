package exam01;

import config.AppCtx;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import java.sql.PreparedStatement;
@Transactional
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppCtx.class)
public class Ex01 {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test
    void test1() {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        int result = jdbcTemplate.update(con -> {
                String sql = "insert into member(seq, email, user_name, password) " +
                        " values(seq_member.nextval,?,?,?)";
                PreparedStatement pstmt = con.prepareStatement(sql, new String[] {"seq"});
                pstmt.setString(1, "user06@test.com");
                pstmt.setString(2, "사용자06");
                pstmt.setString(3, "1234");

                return pstmt;
        }, keyHolder);
        System.out.println(result);
        Number key = keyHolder.getKey(); //자동 생성되는 키값 : 반드시 숫자 타입의 키
        long seq = key.longValue();
        System.out.println(seq);
    }
}
