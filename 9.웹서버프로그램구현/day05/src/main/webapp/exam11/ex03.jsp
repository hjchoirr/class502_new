<%@ page contentType="text/html;charset=UTF-8" %>
<%
    Cookie cookie = new Cookie("key2", "value2");
    cookie.setMaxAge(60 * 60 * 24 * 7);
    //cookie.setMaxAge(0);
    response.addCookie(cookie);
%>