package exam01;

import member.Board;
import member.Member;
import member.User;
import member.User2;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class Ex02 {
    @Test
    void test1() {
        Member member = new Member("USER02", "사용자02");
        System.out.println(member);
    }
    @Test
    void test2() {
        Board board = new Board("제목", "내용");
        System.out.println(board);

    }
    @Test
    void test3() {
        User user = User.builder().userId("USER01").userNm("사용자01").userEmail("aaa@aaa.com").build();
        System.out.println(user);

    }
    @Test
    void test4() {
        User2 user = User2.builder().userId("USER01").userNm("사용자01").email("aaa@aaa.com").regDt(LocalDateTime.now()).build();
        System.out.println(user);
    }
}
