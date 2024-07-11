package org.choongang.member.repositories;

import org.choongang.config.MvcConfig;
import org.choongang.member.entities.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;

import java.util.List;

import static org.springframework.data.domain.Sort.Order.desc;
import static org.springframework.data.relational.domain.SqlSort.SqlOrder.asc;

@SpringJUnitWebConfig
@ContextConfiguration(classes = MvcConfig.class)
public class MemberRepositoryTest {

    @Autowired
    private MemberRepository repository;

    @Test
    void test1() {
        List<Member> members = (List<Member>) repository.findAll();
        members.forEach(System.out::println);
    }

    @Test
    void test2() {
        Member member = Member.builder()
            .seq(1L)
            .email("user06@test.com")
            .password("12345")
            .userName("사용자06")
            .build();
        repository.save(member);
    }

    @Test
    void test3() {
        Member member = repository.findById(1L).orElse(null);
        System.out.println(member);
    }

    @Test
    void test4() {
        Member member = repository.findByEmail("user06@test.com");
        System.out.println(member);
    }

    @Test
    void test5() {
        Pageable pageable = PageRequest.of(0,3);
        Page<Member> members = repository.findByUserNameContaining("사용", pageable);
        members.forEach(System.out::println);
    }
    @Test
    void test6() {
        List<Member> members = repository.findByUserNameAndEmailContainingOrderByRegDt("사용", "user");
        members.forEach(System.out::println);

    }
    @Test
    void test7() {
        List<Member> members = repository.getMembers("%용자%", "%user%");
        members.forEach(System.out::println);
    }

    @Test
    void test8() {
        //Pageable pageable = PageRequest.of(1,3);
        //Pageable pageable = PageRequest.of(0,3, Sort.by(Sort.Order.desc("regDt")));
        Pageable pageable = PageRequest.of(0,3, Sort.by(desc("regDt"), asc("email")));
        Page<Member> data = repository.findByUserNameContaining("사용", pageable);

        List<Member> members = data.getContent();

        long total = data.getTotalElements();
        int pages = data.getTotalPages();

        members.forEach(System.out::println);
        System.out.printf("total=%d pages=%d\n", total, pages);

    }
}
