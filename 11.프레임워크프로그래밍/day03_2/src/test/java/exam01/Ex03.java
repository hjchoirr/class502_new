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
public class Ex03 {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    void test() {
        List<Member> members = jdbcTemplate.query("select * from member where seq > ?", this::mapper, 0);

        System.out.println(members);
    }
    @Test
    void test1() {
        String email = "%user01@test.com";
        Member member = jdbcTemplate.queryForObject("select * from member where email like ?", (rs, num) ->{
            return Member.builder()
                    .seq(rs.getLong("seq"))
                    .email(rs.getString("email"))
                    .userName(rs.getString("user_name"))
                    .password(rs.getString("password"))
                    .regDt(rs.getTimestamp("reg_dt").toLocalDateTime())
                    .build();

        }, email);
        System.out.println(member);
    }

    @Test
    void test2() {
        int total = jdbcTemplate.update("update member set password = ? where email = 'user01@test.com'", "1234");
        System.out.println(total);
    }

    public Member mapper(ResultSet rs, int num) throws SQLException {
        return Member.builder()
            .seq(rs.getLong("seq"))
            .email(rs.getString("email"))
            .userName(rs.getString("user_name"))
            .password(rs.getString("password"))
            .regDt(rs.getTimestamp("reg_dt").toLocalDateTime())
            .build();
    }
}
