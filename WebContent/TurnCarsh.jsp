
<%@page import="com.UeserInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="db" class="com.UeserInfo" scope="page"></jsp:useBean>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
  <link href="css/login_style.css" rel="stylesheet" type="text/css">

</head>
<body>


	
	<div>
	
	
	  <!--nav begin-->
        <div id="nav">
            <!--<div class="nav_left"></div>
            <div class="nav_right"></div>-->
            <ul>
                  <li class="login"><a href="#" style=" width:160px; float:left;"><img src="images/11.jpg" width="60" height="60" style="vertical-align:middle;"><span style=" padding-bottom:20px; margin-left:8px; ">个人中心</span></a></li>
           
                <li class="info"><a href="TurnCarsh.jsp">转账</a> </li>
                <li class="info"><a href="deposit.jsp">存款</a> </li>
                <li class="info"><a href="selectCarsh.jsp">查询</a> </li>
                <li class="info"><a href="changePwd.jsp">修改密码</a> </li>
                <li class="info" onClick="firm()"><a href="#">退出</a> </li>
            </ul>
        </div>
        <!--nav end-->
	<center><h1 style="color: #FFFFFF">User Login</h1></center>
<div id="window" class="login_box">
	<div class="float_l">
    <div class="login_title"> 用戶转账</div>
    <% Object _id=session.getAttribute("_id"); %>
		<form name="form1" method="post" action="TurnServlet?bank_id=<%=_id%>">
    		<div id="login_node" style="display:block; margin-left: 50px;">
			    <ul>转入卡号<label><input type="text" name="turn_id" id="turn_id" class="input_on"/></label></ul>
			    <ul>转入金额<label><input type="text" name="turnmoney" id="turnmoney" class="input_on"/></label></ul>
			        <a class="a-upload">
			            <input  type="submit" name="button" id="button" value="提交"/>提交
			        </a>

   </div>
   </form>
   </div>
	
    <div class="clear"></div>
</div>
<div id="div1"><img src="images/b.jpg" /></div>



</div>






























	


</body>
</html>