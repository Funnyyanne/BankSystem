<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>添加 用户</title>
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
    <div class="login_title"  >用戶注册</div>
    <form id="form1" name="addUser" method="post" action="RegisterServlet" >
	 	<div id="register_node" >
           
           <ul>注册卡号<input name="_id" type="text" id="_id" class="input_on" ></ul>
           <ul>密&nbsp;&nbsp;&nbsp;码&nbsp;&nbsp;&nbsp;<input name="pwd" type="password" id="pwd" class="input_on" ></ul>
           <ul>确认密码<input name="tpwd" type="password" id="tpwd"  class="input_on"   ></ul>
         
           <ul>身&nbsp;份&nbsp;证&nbsp;<input name="idcard" type="text" id="idcard" class="input_on" ></ul>
           <ul>开户金额<input name="money" type="text" id="money" class="input_on" ></ul>
            <ul>姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名<input name="name" type="text" id="name" class="input_on" ></ul>
   
   		  <a href="" class="a-upload" >        
           <input type="submit" name="Submit1" value="提交" class="btn"/>提交
			 </a>
			 <a href="" class="a-upload" >
			<input type="reset" name="Submit1" value="重写" class="btn" style="margin-left:20px"/>
               重写
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