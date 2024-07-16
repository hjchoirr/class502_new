package org.choongang.survey.controllers;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
@Slf4j
@Controller
@RequestMapping("/servey")
@SessionAttributes("requestSurvey")
public class SurveyController {

    @ModelAttribute
    public RequestSurvey requestServey() {
        return new RequestSurvey();
    }

    @GetMapping("/step1")
    public String step1() { // get일때는 @ModelAttribute 명시해야함
        return "survey/step1";
    }

    @PostMapping("/step2")
    public String step2(RequestSurvey form) {
        log.info("step2");
        log.info("form : " + form.toString());
        return "survey/step2";
    }

    @PostMapping("/step3")
    public String step3(RequestSurvey form, SessionStatus status) {
        log.info("step3");

        log.info("form : " + form.toString());

        status.setComplete(); // 세션 비우기 - request

        log.info("status.setComplete() 후");

        log.info("form : " + form.toString());
        return "survey/step3";
    }
}
