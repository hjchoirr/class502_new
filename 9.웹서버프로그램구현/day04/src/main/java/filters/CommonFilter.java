package filters;
import jakarta.servlet.*;
import java.io.IOException;

public class CommonFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        System.out.println("CommonFilter 요청전");  // 여기 코드 삽입 지양

        chain.doFilter(new CommonRequestWrapper(request), new CommonResponseWrapper(response));

        System.out.println("CommonFilter 응답후"); // 여기 코드 삽입 지양

    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("CommonFilter - init()");
        System.out.println("key1 : " + filterConfig.getInitParameter("key1"));
        System.out.println("key2 : " + filterConfig.getInitParameter("key2"));
    }

    @Override
    public void destroy() {
        System.out.println("CommonFilter - destroy()");

    }
}
