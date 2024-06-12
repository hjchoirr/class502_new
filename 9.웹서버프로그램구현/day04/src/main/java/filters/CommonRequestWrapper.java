package filters;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;

public class CommonRequestWrapper extends HttpServletRequestWrapper {

    public CommonRequestWrapper(ServletRequest request) {
        super((HttpServletRequest) request);

        //요청전 공통처리부분
        System.out.println("요청전 공통처리 코드...CommonRequestWrapper 생성자");
    }
/*
    @Override
    public String getParameter(String name) {
        String value = super.getParameter(name);
        value = value == null ? value : "★" + value + "♥";
        return value;
    }
*/
}
