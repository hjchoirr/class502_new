package exam01;

import config.AppCtx;
import member.entities.Member;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppCtx.class)
public class Ex01 {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    void test1() {
        String sql = "insert into member (seq, email, password, user_name) " +
                " values (SEQ_MEMBER.NEXTVAL, ?, ?, ?)";

        int result = jdbcTemplate.update(sql, "user03@test.com", "123456", "사용자03");
        System.out.println(result);
    }

    @Test
    void test2() {
        List<Member> members = jdbcTemplate.query("select * from member",
            this::mapper);
        System.out.println(members);
    }

    @Test
    void test3() {
        String email = "user05@test.com";
        try {
            Member member = jdbcTemplate.queryForObject("select * from member where email = ?",
                    (rs, num) -> mapper(rs, num), email);
            System.out.println(member);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private Member mapper(ResultSet rs, int num) throws SQLException {
        return  Member.builder().seq(rs.getLong("seq"))
                .email(rs.getString("email"))
                .password(rs.getString("password"))
                .userName(rs.getString("user_name"))
                .regDt(rs.getTimestamp("reg_dt").toLocalDateTime())
                .build();
    }

    @Test
    void test4() {
        int total = jdbcTemplate.queryForObject("select count(*) from member", int.class);
        System.out.println(total);
    }
}
