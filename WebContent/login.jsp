<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
                <li class="login"><a href="#" style=" width:160px; float:left;"><img src="images/11.jpg" width="60" height="60" style="vertical-align:middle;"><span style=" padding-bottom:20px; margin-left:8px; ">校园银行</span></a></li>
            <li class="info"><a href="index.jsp">首页</a> </li>
                <li class="info"><a href="#">个人服务</a> </li>
                <li class="info"><a href="#">企业服务</a> </li>
                <li class="info"><a href="#">信用卡</a> </li>
                <li class="info"><a href="#">关于银行</a> </li>
            </ul>
        </div>
        <!--nav end-->
	<center><h1 style="color: #FFFFFF">User Login</h1></center>
<div id="window" class="login_box">
	<div class="float_l">
    <div class="login_title"> 用戶登錄</div>
<form id="form1" name="form1" method="post" action="LoginServlet">
    <div  id="login_node" style="display:block; margin-left: 50px;">
    <ul>证件卡号<label><input name="_id" type="text" id="_id" class="input_on"/></label></ul>
   <ul>密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码<label><input name="pwd" type="password" id="pwd" class="input_on"/></label></ul>
        <a class="a-upload">
            <input type="submit" name="Submit" value="登录"/>登录
        </a>
        <center style="text-align:right;"><a href="register.jsp" style="text-align:right;text-decoration:none;  color:#06F;">新用户注册</a></center>
   </div>
   </form>
   </div>
	

    <div class="clear"></div>
</div>
<div id="div1"><img src="images/b.jpg" /></div>



</div>
</body>
</html>