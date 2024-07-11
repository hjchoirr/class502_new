package org.choongang.member.repositories;

import org.choongang.member.entities.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MemberRepository extends CrudRepository<Member, Long> {
    Member findByEmail(String email);
    //List<Member> findByUserNameContaining(String keyword);
    Page<Member> findByUserNameContaining(String keyword, Pageable pageable);
    List<Member> findByUserNameAndEmailContainingOrderByRegDt(String key1, String key2);

    @Query("select * from member where user_name like :param1 and email like :param2 order by reg_dt desc")
    List<Member> getMembers(@Param("param1") String key1, @Param("param2") String key2);

}
