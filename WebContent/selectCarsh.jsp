<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/style.css" rel="stylesheet" type="text/css">
  <link href="css/login_style.css" rel="stylesheet" type="text/css">
<title>查询</title>
<script type="text/javascript">
			function firm() 
			{
			        //利用对话框返回的值 （true 或者 false）	  
			    if(confirm("你确定要退出账户吗？"))
			    {
			 			<%
							Object bank_id = session.getAttribute("_id");

			 				out.println();

			 				session.invalidate();
						
							response.setHeader("refresh", "5;url= index.jsp");

			 			%>
			     }
			  
			    else
			    {
			      alert("你取消了退出");
			  
			    }
			  
			}
</script>
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
        
        <div id="window" class="login_box">
	<div class="float_l">
    <div class="login_title"> 用户查询</div>
<form method="post"  action="SelectServlet">
    <div  id="login_node" style="display:block; margin-left: 50px;">
    <ul>请输入查询卡号:<label><input name="_id" type="text" id="_id" class="input_on"/></label></ul>
   
        <a class="a-upload">
            <input type="submit" name="Submit2" value="提交" class="btn"/>提交
        </a>
            <a class="a-upload"><input type="reset" name="Submit1" value="重写" class="btn" style="margin-left:20px"/>重写</a>
   </div>
   </form>
   </div>
	
    <div class="clear"></div>
</div>
        
        
        
        
 
		<div id="div1"><img src="images/b.jpg" /></div>
</div>

</body>
</html>