package org.choongang.member.controllers;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Locale;

@Slf4j
@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MessageSource messageSource;
    private final HttpServletRequest request;

    @ModelAttribute("commonValue")
    public String commonValue() {
        return "공통 속성값..";
    }

    @ModelAttribute("hobbies")
    public List<String> hobbies() {
        return List.of("취미1", "취미2", "취미3", "취미4");
    }

    @ModelAttribute("hobbies2")
    public List<CodeValue> hobbies2() {
        return List.of(
                new CodeValue("취미1", "hobby1"),
                new CodeValue("취미2", "hobby2"),
                new CodeValue("취미3", "hobby3"),
                new CodeValue("취미4", "hobby4")
        );
    }
    @GetMapping("/join")
    public String join(@ModelAttribute RequestJoin form) {
        Locale locale = request.getLocale(); //브라우저에 설정된 언어 : 요청헤더 Accept-Language
        String message = messageSource.getMessage("EMAIL", null, locale);

        log.info(message);
        return "member/join";
    }

    @PostMapping("/join")
    public String joinPs(RequestJoin form){

        log.info(form.toString());
        return "member/join";

        //return "redirect:/member/login";
        //return "forward:/member/login";

    }
    @GetMapping("/login")
    public String login(RequestLogin2 form) {

        System.out.println("Get-login!!");
        if(form != null ) {
            log.info("email={}, password={}", form.email(), form.password());
        }
        return "member/login";
    }

    /*
    @GetMapping("/join")
    public String join(Model model) { //

        RequestJoin form = new RequestJoin();
        model.addAttribute("requestJoin", form); //join.jsp 에 form에서 커맨드 객체 requestJoin  사용하므로 빈거라도 있어야
        return "member/join";
    }

    //private final Logger log = LoggerFactory.getLogger(MemberController.class);
    @GetMapping("/join")
    public String joinNoParam(Model model, HttpServletRequest request){
        log.info("mode없음");
        log.info("{}, {} 없음", "mode1", "mode2");

        return "member/join";
    }

    @GetMapping(path="/join", params={"mode=join"}) // mode=join 있어야만 여기로 매핑됨
    public String join(Model model, HttpServletRequest request){
        log.info("mode=join");
        return "member/join";
    }

    //@PostMapping(path="/join", headers="appKey=1234", consumes = "application/json") //요청헤더 인증키, content-Type:json 인 것만 응답함
    @PostMapping(path="/join", headers="appKey=1234", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE) //요청헤더 인증키, content-Type:json 인 것만 응답함
    public String joinPs(RequestJoin form) {
        log.info("joinPs 실행..");
        return "redirect:/member/login";
    }
    */
}
