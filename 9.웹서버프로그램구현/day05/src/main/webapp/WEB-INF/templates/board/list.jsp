<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="layout" tagdir="/WEB-INF/tags/layouts" %>
<layout:main title="게시글 목록">
<h1>게시글 목록</h1>
<ul>
<c:forEach  var="item" items="${items}" varStatus="status">
    <li>${item.seq} | ${item.subject} | ${item.poster} | ${item.content} | ${item.regDt}
        <div>
            index: ${status.index} / count: ${status.count}
            first: ${status.first} / last: ${status.last}<br>
            current: ${status.current}
        </div>
    </li>
</c:forEach>
</ul>
</layout:main>
