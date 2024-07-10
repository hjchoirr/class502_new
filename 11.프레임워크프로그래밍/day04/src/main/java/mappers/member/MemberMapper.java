package mappers.member;

import org.apache.ibatis.annotations.Select;

public interface MemberMapper {

    @Select("select count(*) from member")
    long getTotal();
}
