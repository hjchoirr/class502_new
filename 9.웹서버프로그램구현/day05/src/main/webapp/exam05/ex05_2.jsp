<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<c:forEach begin="1" end="10" var="cnt" >
    ${cnt}
</c:forEach>
<br>
<c:forEach var="item" items="Apple,Mango,Orange">
    ${item} <br>
</c:forEach>