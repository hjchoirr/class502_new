package mappers;
import member.Member;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;
public interface MemberMapper {
    List<Member> getList();

    @Select("SELECT user_no userNo, user_id userId FROM MEMBER")
    List<Member> getList2();
    List<Member> getList3(Member member);
    List<Member> getList4(List<String> userIds);
    List<Member> getList5(long userNo);

    int register(Member member);
    int register2(Member member);

    int modify(Member member);

    int delete(String userId);

    @Delete("delete from member where user_id = #{userId}")
    int delete2(String userId);



}
