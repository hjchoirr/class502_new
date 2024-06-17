<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<fmt:bundle basename="messages.common">
<form>
    <fmt:message key="EMAIL" />
    <input type="text" name="email"><br>

    <frm:message key="PASSWORD" />
    <input type="text" name="password"><br>

    <button type="submit"><fmt:message key="LOGIN" /><button>
</form>
</fmt:bundle>