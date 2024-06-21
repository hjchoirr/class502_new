<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="util" tagdir="/WEB-INF/tags/utils" %>
<c:url var="loginurl"   value="/member/login" />
<c:url var="joinurl"   value="/member/join" />
<c:url var="logouturl"   value="/member/logout" />

로그인 상태 : ${isLogin} <br>

<util:GuestOnly>
    <a href="${loginurl}">로그인</a>
    <a href="${joinurl}">회원가입</a>
</util:GuestOnly>
<util:MemberOnly>

    ${loggedMember.userName}(${loggedMember.email}) 님 로그인..
    <a href="${logouturl}">로그아웃</a>
</util:MemberOnly>

