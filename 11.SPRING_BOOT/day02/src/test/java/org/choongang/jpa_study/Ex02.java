package org.choongang.jpa_study;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.choongang.member.entities.Member;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@SpringBootTest
@Transactional
@TestPropertySource(properties = "spring.profiles.active=test")

public class Ex02 {
    @PersistenceContext
    private EntityManager em;

    @BeforeEach
    void init() {
        for(long i = 1L; i <= 10L; i++) {

            Member member = new Member();
           // member.setSeq(i);
            member.setEmail("user" + i + "@test.com");
            member.setPassword("12345678");
            member.setUserName("사용자" + i);
            member.setCreatedAt(LocalDateTime.now());
            em.persist(member);

        }
        em.flush(); // DB insert
        //em.clear(); // PersistenceContext 비우기
    }


    @Test
    void test1() {

        Member member = em.find(Member.class, 1L);  // 기본키로 조회
        System.out.println(member);

        Member member2 = em.find(Member.class, 1L);
        System.out.println(member2);

        System.out.println(member == member2);

        member.setUserName("(수정)사용자1");
        //em.flush(); // UPDATE 쿼리수행
        // 값 변경 후, 삭제 상태 변경 후 해당 데이터 조회하면 -> 암묵적으로 flush()
        System.out.println("find 전--");
        Member member3 = em.find(Member.class, 1L);
        System.out.println(member3);

    }
}
