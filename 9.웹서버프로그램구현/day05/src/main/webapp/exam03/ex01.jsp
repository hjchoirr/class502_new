<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.*" %>
<jsp:useBean id="items" class="java.util.ArrayList" scope="request"/>
${items}
<%
/*  scope : page일때
    ArrayList data = (ArrayList)pageContext.getAttribute("items");
*/
    // scope : request 이면 못가져옴
    ArrayList data = (ArrayList)request.getAttribute("items");

    data.add("A");
    data.add("B");

    System.out.println(data);
%>