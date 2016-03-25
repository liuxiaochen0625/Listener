<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		ArrayList showList=(ArrayList)(getServletContext().getAttribute("list"));
		out.print("在线人数 "+showList.size()+"<br>");
		for(int i=0;i<showList.size();i++){
			out.print(showList.get(i)+"在线"+"<br>");
		}
	%>
	<br>
	<a href="login.jsp">退出</a>
</body>
</html>