package exam02;

import configs.DBConn;
import exam01.Member;
import mappers.MemberMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Ex01 {

    @Test
    void test1() {
        SqlSession session = DBConn.getSession();
        List<Member> members = session.selectList("mappers.MemberMapper.getList");
        members.forEach(System.out::println);
    }
    @Test
    void test2() {
        SqlSession session = DBConn.getSession();
        MemberMapper mapper = session.getMapper(MemberMapper.class);
        List<Member> members = mapper.getList();
        members.forEach(System.out::println);
    }
}