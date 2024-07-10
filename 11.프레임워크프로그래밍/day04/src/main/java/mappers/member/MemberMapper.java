package mappers.member;

import member.entities.Member;
import org.apache.ibatis.annotations.Select;

public interface MemberMapper {

    @Select("select count(*) from member")
    long getTotal();

    int register(Member member);
    Member get(String email);
    int exists(String email);
}
