package org.choongang.jpa_study;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.choongang.member.entities.Member;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
@TestPropertySource(properties = "spring.profiles.active=test")
public class Ex04 {

    @PersistenceContext
    private EntityManager em;

    @Test
    void test1() throws InterruptedException {
        Member member = new Member();
        member.setEmail("user01@test.com");
        member.setPassword("12345");
        member.setUserName("사용자01");
        em.persist(member);

        em.flush();
        em.clear();

        member = em.find(Member.class, member.getSeq());
        System.out.println("member = " + member);
        System.out.println("createAt: " + member.getCreatedAt() + "modifiedAt: " + member.getModifiedAt());

        Thread.sleep(5000);
        member.setUserName("(수정)사용자01");

        em.flush();
        em.clear();

        member = em.find(Member.class, member.getSeq());
        System.out.println("createAt: " + member.getCreatedAt() + "modifiedAt: " + member.getModifiedAt());

        System.out.println("member = " + member);

    }
}
