package org.choongang.member.controllers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.choongang.global.exceptions.BadRequestException;
import org.choongang.member.entities.Member;
import org.choongang.member.services.JoinService;
import org.choongang.member.services.LoginService;
import org.choongang.member.validators.JoinValidator;
import org.choongang.member.validators.LoginValidator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.Thymeleaf;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.IntStream;

@Slf4j
@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {
    private final JoinValidator joinValidator;
    private final LoginValidator loginValidator;
    private final JoinService joinService;
    private final LoginService loginService;

    @GetMapping("/join")
    public String join(@ModelAttribute RequestJoin form) {
        return "member/join";
    }

    @PostMapping("/join")
    public String joinPs(@Valid RequestJoin form, Errors errors) { // Valid 커맨드객체 바로 뒤에 에러객체 : 중요

        joinValidator.validate(form, errors);

        if(errors.hasErrors()) { //reject, rejectValue 가 한번이라도 호출되면 true
            return "member/join";
        }
        joinService.process(form);

        return "redirect:/member/login";
    }

    @GetMapping("/login")
    public String login(@ModelAttribute RequestLogin form,
                        @CookieValue(name="savedEmail", required = false) String savedEmail
                        /*@SessionAttribute(name="member", required = false) Member member*/) {

        if(savedEmail != null) {
            form.setSaveEmail(true);
            form.setEmail(savedEmail);
        }

        return "member/login";
    }

    @PostMapping("/login")
    public String loginPs(@Valid RequestLogin form, Errors errors) {
        if(errors.hasErrors()) {   // @Valid 에 에러 없으면
            loginValidator.validate(form, errors);
        }

        if(errors.hasErrors()) {  // loginValidator 에 에러 없으면
            return "member/login";
        }

        loginService.process(form);
        return "redirect:/";
    }

    @RequestMapping("/logout")
    public  String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/member/login";
    }

    @GetMapping("list")   // Thymeleaf 테스트용
    public String list(Model model) {
        /*
        Member member = Member.builder().email("user01@test.com")
                .password("12345678")
                .userName("<h1>사용자01</h1>")
                .regDt(LocalDateTime.now())
                .build();
        model.addAttribute("member", member);
         */

        List<Member> items = IntStream.rangeClosed(1, 10).mapToObj(i -> Member.builder()
                .email("user" + i + "@test.com")
                .userName("사용자" + i)
                .regDt(LocalDateTime.now())
                .build()
        ).toList();

        model.addAttribute("items",items);
        model.addAttribute("addCss", new String[] {"member/style", "member/list"});
        model.addAttribute("addScript", List.of("member/common", "member/list"));

        return "member/list";
    }
/*
    @GetMapping("/list")
    public String list(@Valid @ModelAttribute MemberSearch memberSearch, Errors errors) {

        log.info(memberSearch.toString());

        boolean result = false;
        if(!result) {
            throw new BadRequestException("예외발생!!");
        }
        return "member/list";
    }
/*
    @ExceptionHandler(Exception.class)
    public String errorHandler(Exception e, Model model, HttpServletRequest request, HttpServletResponse response) {

        e.printStackTrace();
        log.info("MemberController에서 유입");

        return "error/common";
    }
 */
    @ResponseBody
    @GetMapping({"/info/{id}/{id2}", "/info/{id}", "/info/", "/info//", "/info///"})
    public void info(@PathVariable(name="id", required = false) String email, @PathVariable(name="id2", required = false) String email2) {
        log.info("email : {} email2 : {} ", email, email2);
    }

    @GetMapping("/list2")
    @ResponseBody
    public List<Member> list2() {
        List<Member> members = IntStream.range(1, 10).mapToObj(i ->
            Member.builder()
                .seq((long)i)
                .userName("사용자" + i)
                .email("user0" + i)
                .regDt(LocalDateTime.now())
                .password("1234")
                .build()).toList();
        return members;
    }

/*
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.setValidator(joinValidator);
    }
 */
}
