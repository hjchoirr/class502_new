package org.choongang.member.controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.choongang.global.exceptions.CommonException;
import org.choongang.member.services.LoginService;
import org.choongang.member.services.MemberServiceProvider;

import java.io.IOException;

import static org.choongang.global.MessageUtil.alertError;
import static org.choongang.global.MessageUtil.go;

@WebServlet("/member/login")
public class LoginController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/templates/member/login.jsp");
        System.out.println("doGet-login");
        rd.forward(req,resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            LoginService service = MemberServiceProvider.getInstance().loginService();

            service.process(req);

            //이메일 기억하기 처리
            String email = req.getParameter("email");
            Cookie cookie = new Cookie("saveEmail", email);

            if(req.getParameter("saveEmail") != null) {
                // 7일간 기억하기
                cookie.setMaxAge(60 * 60 * 24 * 7);
            } else { // 체크 해제 : 만료날짜를 과거로
                cookie.setMaxAge(0);
            }

            resp.addCookie(cookie);
            go(req.getContextPath() + "/", "parent", resp); //iframe에서 처리된거라서 부모프레임으로 돌아가기

        }catch(CommonException e) {
            alertError(e, resp);
        }
    }
}
