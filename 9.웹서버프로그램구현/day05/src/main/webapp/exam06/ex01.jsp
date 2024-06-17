<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>


<c:catch var="e">
<%
    String str = null;
    str.toUpperCase();
%>
</c:catch>
<c:if test="${e != null}">
    <%--에러메시지 : ${e.getMessage()} 아래줄과 동일-->
    에러메시지 : ${e.message}
</c:if>

