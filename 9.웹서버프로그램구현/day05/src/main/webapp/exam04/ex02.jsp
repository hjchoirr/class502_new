<%@ page contentType="text/html;charset=UTF-8" %>
<%
    pageContext.setAttribute("num", 300);
    request.setAttribute("num", 200);
    application.setAttribute("num", 100);
    session.setAttribute("num", 400);

    pageContext.setAttribute("max-num", 1000);

%>
pageContext.num : ${pageScope.num}<br>
request.num : ${requestScope.num}<br>
application.num : ${applicationScope.num}<br>
session.num : ${sessionScope.num}<br>
max-num : ${pageScope["max-num"]}<br> <!-- max-num :변수명 규칙과 맞지 않을때 -->


