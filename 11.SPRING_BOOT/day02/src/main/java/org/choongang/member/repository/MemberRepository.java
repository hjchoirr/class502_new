package org.choongang.member.repository;

import org.choongang.member.entities.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long>, QuerydslPredicateExecutor<Member> {
    Member findByEmail(String email);

    Page<Member> findByEmailContaining(String keyword, Pageable pageable);

    List<Member> findByEmailContainingAndUserNameContainingOrderByCreatedAtDesc(String key1, String key2);

    @Query("select m from Member m where m.email like :k1 and m.userName like :k2 order by m.createdAt desc") //entity의 이름 기준으로
    List<Member> getMembers(@Param("k1") String key1, @Param("k2")String key2);
}
