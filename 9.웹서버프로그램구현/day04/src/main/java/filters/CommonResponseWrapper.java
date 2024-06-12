package filters;

import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletResponseWrapper;

public class CommonResponseWrapper extends HttpServletResponseWrapper {
    
    // 생성자: HttpServletRequest형 -> ServletRequest형으로 형변환
    public CommonResponseWrapper(ServletResponse response) {
        super((HttpServletResponse) response); // 다시 다운 캐스팅

        System.out.println("응답후 공통부분 - CommonResponseWrapper 생성자");

    }
}
