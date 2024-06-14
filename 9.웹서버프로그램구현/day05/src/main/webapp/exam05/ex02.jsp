<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<c:set var="num1" value="100" />
<c:set var="num1" value="200" scope="request" />
<c:set var="num1" value="300" scope="application" />
pageScope.num1 : ${pageScope.num1} <br>
requestScope.num1 : ${requestScope.num1} <br>
applicationScope.num1 : ${applicationScope.num1} <br>

<c:remove var="num1" />

pageScope.num1 : ${pageScope.num1} <br>
requestScope.num1 : ${requestScope.num1} <br>
applicationScope.num1 : ${applicationScope.num1} <br>
