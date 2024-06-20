package org.choongang.global;

import jakarta.servlet.http.HttpServletResponse;
import org.choongang.global.exceptions.CommonException;

import java.io.IOException;
import java.io.PrintWriter;

public class MessageUtil {
    public static void alertError(Exception e, HttpServletResponse resp) throws IOException {

        resp.setContentType("text/html; charset=UTF-8");
        if(e instanceof CommonException commonException) {
            //CommonException commonException = (CommonException) e; //이거보다 간단히 윗줄로..
            resp.setStatus(commonException.getStatus());
        }
        PrintWriter out = resp.getWriter();
        out.printf("<script>alert('%s');</script>", e.getMessage()); //응답코드 설정하기
    }
    public static void go(String url, String target, HttpServletResponse resp) throws IOException {
        target = target == null || target.isBlank() ? "self" : target ;

        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();
        //location.href : 이동기록 남아서 뒤로 가기 하면 이전 POST 페이지로 갈 수 있어서 .. replace(url)로 해야함
        //out.printf("<script>%s.location.href='%s';</script>", target, url);
        out.printf("<script>%s.location.replace('%s');</script>", target, url);

    }

    public static void go(String url, HttpServletResponse resp) throws IOException {
        go(url, "self", resp);
    }
}
