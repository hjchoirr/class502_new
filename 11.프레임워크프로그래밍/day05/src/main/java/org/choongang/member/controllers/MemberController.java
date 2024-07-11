package org.choongang.member.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {

    @GetMapping("/join")
    public String join(Model model, HttpServletRequest request){
        return "member/join";
    }

    @PostMapping("/join")
    public String joinPs(RequestJoin form) {

        return "redirect:/member/login";
    }
}
