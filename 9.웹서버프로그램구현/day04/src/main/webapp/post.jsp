<%@ page contentType="text/html;charset=UTF-8" %>
<h1>게시글 작성</h1>

<form method="post" action="post_ps.jsp">
    제목 : <input type="text" name='subject'><br>
    내용 : <textarea name="content"></textarea><br>
    <button type="submit">작성하기</button>
</form>
<%
	// 스크립틀릿 : 메서드 지역 내부 _jspService() 
	int num1 = 100;
	int num2 = 200;
	
	//int result = num1 + num2;
	
	int result = add(num1, num2);
	System.out.println(result);
	
	/* 주석2	*/
	
%>
<br>
<%-- JSP 주석 --%>

<%=num1%>+<%=num2%>=<%=result%>

<!-- HTML 주석 -->

<%! // 선언문 : 인스턴스변수
	int num1 = 10;
	int num2 = 20;
	
	int add(int num1, int num2) {
		return num1 + num2;
	}
	
%>

<%!int data = 50;%>
<%
	out.println("Value of the variable is:" + data);
%>
<%
	int aa = 60;
	out.println("aa=" + aa);
	out.printf("aa=%d%n", aa);

%>
<%!
	
%>