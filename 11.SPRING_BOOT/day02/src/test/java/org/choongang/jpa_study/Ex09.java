package org.choongang.jpa_study;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.choongang.board.entities.BoardData;
import org.choongang.board.repositories.BoardDataRepository;
import org.choongang.member.constants.Authority;
import org.choongang.member.entities.Member;
import org.choongang.member.repository.MemberRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.IntStream;

@SpringBootTest
@ActiveProfiles("test")
@Transactional //관계매핑 등 연관테이터 가져올때는 원 엔티티가 영속성 상태를 유지할 수 있도록 Transactional
public class Ex09 {
    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private BoardDataRepository boardDataRepository;

    @PersistenceContext  // @Autowired 포함된 기능
    private EntityManager em;

    @BeforeEach
    void init() {
        Member member = Member.builder()
            .email("user01@test.com")
            .password("12345")
            .userName("사용자01")
            .authority(Authority.USER)
            .build();
        memberRepository.saveAndFlush(member);

        List<BoardData> items = IntStream.rangeClosed(1, 10)
            .mapToObj(i-> BoardData.builder()
                .subject("제목" + i)
                .content("내용" + i)
                .member(member)
                .build()).toList();

        boardDataRepository.saveAllAndFlush(items);
        em.clear() ; // 1차 캐시 방지 하기 : 테스트 확실히 하기 위해
    }
    @Test
    void test1() {
        BoardData boardData = boardDataRepository.findById(1L).orElse(null);
        System.out.println("======================================");

        Member member = boardData.getMember();
        System.out.println("--------------------------------------");
        System.out.println(member);
    }

    @Test
    void test2() {
        Member member = memberRepository.findById(1L).orElse(null);
        System.out.println("======================================");
        List<BoardData> items = member.getItems();
        System.out.println("--------------------------------------");
        items.forEach(System.out::println);
    }

}
