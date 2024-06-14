<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<c:choose>
    <c:when test="${param.age < 8}">
        유치원생
    </c:when>
    <c:when test="${param.age < 14}">
        초등학생
    </c:when>
    <c:when test="${param.age < 17}">
        청소년
    </c:when>
    <c:otherwise>
        성인
    </c:otherwise>
</c:choose>