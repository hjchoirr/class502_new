package org.choongang.jpa_study;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.choongang.member.entities.Member;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@SpringBootTest
@Transactional  // 테스트에 사용하는 애노테이션 --> 끝나면 롤백함
public class Ex03 {
    @PersistenceContext
    private EntityManager em;

    @Test
    void test1() {

        Member member = new Member();
        member.setEmail("user01@test.com");
        member.setPassword("123456");
        member.setUserName("사용자01");
        member.setCreatedAt(LocalDateTime.now());

        em.persist(member);

        Member member2 = new Member();
        member2.setEmail("user02@test.com");
        member2.setPassword("123456");
        member2.setUserName("사용자02");
        member2.setCreatedAt(LocalDateTime.now());

        em.persist(member2);
        em.flush();
        em.clear();

        Member _member1 = em.find(Member.class, member.getSeq());
        System.out.println("_member1 : " + _member1);

        Member _member2 = em.find(Member.class, member2.getSeq());
        System.out.println("_member2 : " + _member2);

    }
}
