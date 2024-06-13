<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.util.*,java.time.LocalDateTime" %>
<%@ page buffer="32kb" %>
<%@ page info="재미있는 서블릿 연습" %> 

<%
	List<String> names = new ArrayList<>();
	names.add("이름1");
	names.add("이름2");
	out.write(names.toString());
	
	LocalDateTime now = LocalDateTime.now();
	out.write("<br>" + now.toString());
%>
