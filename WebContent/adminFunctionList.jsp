<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
    <jsp:useBean id="db" class="com.UeserInfo" scope="page"></jsp:useBean>
</head>
<body>
		<table width="90%" border="1" align="center" cellspacing="1">
<tr>
<th>卡号:</th >
<th>用户名:</th>
<th>账户余额:</th>
<th>账户余额:</th>
<th>转账记录</th>
<th>时间</th>
<th>操作<a href="enter.jsp">添加</a></th>
</tr>

	<tr>
		<td><%= rs.getString("users")%></td>
		<td><%= rs.getString("pwd")%></td>
		
		<td><%= rs.getString("email")%></td>
		<td><%= rs.getString("lan")%></td>
		<td> <a href="del.jsp?_id=<%=rs.getInt("_id")%>">删除</a>&nbsp;&nbsp;&nbsp;
		<a href="mod.jsp?_id=<%=rs.getInt("_id")%>">修改</a>
			</td>
		</tr>



</table>	
</body>
</html> --%>