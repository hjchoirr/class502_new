package org.choongang.member.mappers;

import org.apache.ibatis.annotations.Select;
import org.choongang.member.entities.Member;

public interface MemberMapper {

    @Select("select count(*) from member")
    long getTotal();

    int register(Member member);
    Member get(String email);
    int exist(String email);
}
