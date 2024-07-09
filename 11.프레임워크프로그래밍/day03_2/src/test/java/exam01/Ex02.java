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
public class Ex02 {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    void test() {
        List<Member> members = jdbcTemplate.query("select * from member", new RowMapper<Member>() {
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
                return null;
            }
        });

        //List<Member> members = jdbcTemplate.query("select * from member", (rs, num) -> mapper(rs, num));
        //List<Member> members = jdbcTemplate.query("select * from member", this::mapper);

        System.out.println(members);

    }

    public Member mapper(ResultSet rs, int num) throws SQLException {
        System.out.println("num : " + num);
        return Member.builder()
                .seq(rs.getLong("seq"))
                .email(rs.getString("email"))
                .password(rs.getString("password"))
                .userName(rs.getString("user_name"))
                .regDt(rs.getTimestamp("reg_dt").toLocalDateTime())
                .build();
    }
}
