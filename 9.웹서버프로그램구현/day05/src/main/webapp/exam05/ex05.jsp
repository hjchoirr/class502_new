<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<c:forEach begin="1" end="10" var="cnt" step="2">
    <div>반복 ${cnt}</div>
</c:forEach>