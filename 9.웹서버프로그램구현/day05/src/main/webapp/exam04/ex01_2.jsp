<%@ page contentType="text/html;charset=UTF-8" %>
<%
    pageContext.setAttribute("a", 20);
    request.setAttribute("b", 30);
    session.setAttribute("c", 40);
    application.setAttribute("d", 50);
%>
${pageScope.a}<br>
${requestScope.b}<br>
${sessionScope["c"]}<br>
${d}<br>

param.a : ${param.a}<br>
param.b : ${param.b}<br>

${paramValues.c[0]}|
${paramValues.c[1]}|
${paramValues.c[2]}


