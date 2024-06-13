<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.net.*" %>
<h1>ex04.jsp</h>
<%
String key1 = URLDecoder.decode(request.getParameter("key1"),"UTF-8");
String key2 = request.getParameter("key2");
%>
<br>
key1 : <%=key1%>
<br>
key2 : <%=key2%>