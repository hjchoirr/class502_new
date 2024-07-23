package org.choongang.jpa_study;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.choongang.member.entities.Member;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@SpringBootTest
@Transactional  // tx.begin(), tx.commit() 대신에..
@TestPropertySource(properties = "spring.profiles.active=test")
public class Ex01 {

    //@Autowired
    @PersistenceContext
    private EntityManager em;

    @Test
    void test1() {

        Member member = new Member();
        member.setSeq(1L);
        member.setEmail("user01@test.com");
        member.setPassword("12345678");
        member.setUserName("사용자01");
        member.setCreatedAt(LocalDateTime.now());

        em.persist(member);  // member 엔티티를 변화 감지 메모리에 넣기 - 변화 감지 관리
        em.flush();   // insert 쿼리 수행
        em.detach(member); // 변화 감지 상태 분리 - 더이상 변화 감지 안함

        member.setUserName("(수정)사용자01");
        member.setModifiedAt(LocalDateTime.now());

        em.merge(member); // 다시 변화 감지 상태
        em.flush();  // Update 쿼리 실행

        //em.remove(member); // 상태만 제거로..
        //em.flush();  // DELETE 쿼리 실행

    }
}
