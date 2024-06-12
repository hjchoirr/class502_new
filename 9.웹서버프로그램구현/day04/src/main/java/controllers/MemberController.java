package controllers;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
@WebServlet("/member/*")
public class MemberController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("URI: " + req.getRequestURI());
        System.out.println("URL: " + req.getRequestURL().toString());
        System.out.println("getQueryString: " + req.getQueryString());
        System.out.println("getMethod: " + req.getMethod());

        String mode = getMode(req);
        if(mode.equals("join")) {
            joinForm(req, resp);
        }else if(mode.equals("login")) {
            loginForm(req, resp);
        }
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String mode = getMode(req);
        if(mode.equals("join")) {
            joinProcess(req, resp);
        }else if(mode.equals("login")) {
            loginProcess(req, resp);
        }
    }

    private String getMode(HttpServletRequest req) {
        String url = req.getRequestURI();
        String[] urls = url.split("/");

        return urls.length > 0 ? urls[urls.length - 1] : "";  // URL 비어있을까봐
    }

    private void joinForm(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<h1>회원가입</h1>");
    }
    private void loginForm(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<h1>로그인</h1>");

    }
    private void joinProcess(HttpServletRequest req, HttpServletResponse resp) {

    }
    private void loginProcess(HttpServletRequest req, HttpServletResponse resp) {

    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("MemberController-init()");
    }

}
