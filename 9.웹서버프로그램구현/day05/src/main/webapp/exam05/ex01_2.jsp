<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<c:set var="a" value="3" />
<c:if test="${a > 4}" >
    ${a} > 4
</c:if>
<c:if test="${!(a > 4)}" >
    ${a} <= 4
</c:if>