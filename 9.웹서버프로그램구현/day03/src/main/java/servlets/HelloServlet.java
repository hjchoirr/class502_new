package servlets;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet()!!");

        // 모든 servlet이 조회 가능
        String common1 = req.getServletContext().getInitParameter("common1");
        String common2 = req.getServletContext().getInitParameter("common2");
        System.out.printf("common1=%s, common2=%s%n", common1, common2);

    }

    @Override
    public void destroy() {
        System.out.println("destroy()");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        //HelloServlet 만 조회가능
        String key1 = config.getInitParameter("key1");
        String key2 = config.getInitParameter("key2");
        System.out.printf("key1=%s, key2=%s%n", key1, key2);


    }
/*
    @Override
    public void init() throws ServletException {
        System.out.println("init()");
    }
 */
}
