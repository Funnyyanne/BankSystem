<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<% 
		out.println("<script></script>");
		session.removeAttribute("_id");
	session.invalidate();
	System.out.println("退出成功，三秒后返回登陸頁面");
	
	response.setHeader("refresh", "3;url= login.jsp");

%>
</body>
</html>