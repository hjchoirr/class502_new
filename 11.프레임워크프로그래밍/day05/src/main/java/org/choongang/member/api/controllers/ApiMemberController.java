package org.choongang.member.api.controllers;

import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.choongang.member.controllers.RequestJoin;
import org.choongang.member.entities.Member;
import org.choongang.member.mappers.MemberMapper;
import org.choongang.member.services.JoinService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.IntStream;

@Slf4j
@RestController
@RequestMapping("/api/member")
@RequiredArgsConstructor
public class ApiMemberController {

    private final MemberMapper mapper;
    private final JoinService joinService;

    @PostMapping
    public ResponseEntity join(@RequestBody RequestJoin form) {
        log.info(form.toString());

        joinService.process(form);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/info/{email}")
    public Member info(@PathVariable("email") String email) {
        Member member = mapper.get(email);

        return member;
    }
    @GetMapping("list")
    public ResponseEntity<List<Member>> list() {
        List<Member> members = IntStream.range(1, 10)
            .mapToObj(i -> Member.builder()
            .email("user" + i + "@test.com")
            .password("12345")
            .userName("사용자" + i)
            .regDt(LocalDateTime.now()).build()).toList();

        HttpHeaders headers = new HttpHeaders();
        headers.add("t1", "v1");
        headers.add("t2", "v2");

        return new ResponseEntity<>(members, headers, HttpStatus.OK);

        //return ResponseEntity.status(HttpStatus.OK).body(members);
    }

    @GetMapping(path="/test", produces = "text/html;charset=UTF-8") // produces: response Header 의 contentType 값 넣기
    public String test() {
        //HttpHeaders headers = new HttpHeaders();
        //headers.add("Content-Type", "text/html;charset=UTF-8");

        //return new ResponseEntity<>("안녕하세요.", headers, HttpStatus.OK);
        return "안녕하세요";
    }
    @GetMapping("/test2")
    public void test2() {
        log.info("test2...");
    }
}
