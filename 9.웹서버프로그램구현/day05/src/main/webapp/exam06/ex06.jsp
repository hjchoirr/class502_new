<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:set var="html" value="<script>alert('알림');</script>" />
<%--
${html}
--%>
<c:out value="${html}" />  <%-- 보안적인 측면에서 사용 --%>
<br>
<c:out value="${str}" default="값없음" />
<c:out value="<h1>제목</h1>" />
<c:out value="<h1>제목제목</h1>" escapeXml="false"/>
