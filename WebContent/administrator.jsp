administrator<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form id="form1" name="form1" method="post" action="AdministratorServlet">
<table width="34%" border="1" align="center">
  <tr>
    <td colspan="2"><h2>管理员登录</h2></td>
  </tr>
  <tr>
    <td>证件卡号</td>
    <td><label><input name="_id" type="text" id="_id"/></label></td>
  </tr>
  <tr>
    <td>密码</td>
    <td><label><input name="pwd" type="password" id="pwd"/></label></td>
  </tr>
  <tr>
    <td colspan="2"><label><center><input type="submit" name="Submit" value="登录"/></center></label></td>
    </tr>
   
</table>
</form>
</body>
</html>