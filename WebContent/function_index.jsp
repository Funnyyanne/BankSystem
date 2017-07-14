 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
  <link href="css/login_style.css" rel="stylesheet" type="text/css">
<jsp:useBean id="db" class="com.DBManager" scope="page"></jsp:useBean>
<script type="text/javascript">
			function firm() 
			{
			        //利用对话框返回的值 （true 或者 false）	  
			    if(confirm("你确定要退出账户吗？"))
			    {
			 		<%-- 	<%
							Object bank_id = session.getAttribute("_id");

			 				out.println();

			 				session.invalidate();
						
							response.setHeader("refresh", "5;url= index.jsp");

			 			%> --%>
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
                   <li class="info"><a href="removeMoney.jsp">取款</a></li>
                <li class="info"><a href="selectCarsh.jsp">查询</a> </li>
                <li class="info"><a href="changePwd.jsp">修改密码</a> </li>
                <li class="info" onClick="firm()"><a href="#">退出</a> </li>
            </ul>
        </div>
        <!--nav end-->


        <!--main begin-->
        <div id="mian">
            <div class="mian_left">
                <div class="photoWen">
                    <ul>
                        <li><h2>企业金融</h2></li>
                        <li><a href="#"><img src="images/Diamond_preferred.png"></a> </li>
                    </ul>
                </div>
                <div class="photoWen">
                    <ul>
                        <li><h2>个人金融</h2></li>
                        <li><a href="#"><img src="images/HP272_M1.jpg"></a> </li>
                    </ul>
                </div>
                <div class="photoWen">
                    <ul>
                        <li><h2>网络金融</h2></li>
                        <li><a href="#"><img src="images/CitiAdvantageCard.png"></a> </li>
                    </ul>
                </div>
            </div>
          <div class="mian_right">
               
                <div id="advert" style="margin-top: 100px;">
                        <img src="images/one.png" width="230" height="281"> 
                        <img src="images/two.png" width="230" height="281">
                        <img src="images/three.png" width="230" height="281">
                </div>
            </div>
        </div>
        <!--main end-->

        <!--footer begin-->
        <div class="copyright">
            <div class="copyright_content">
                <ul>
                    <li>关于
                        <ul>
                            <li>品牌故事</li>
                            <li>联系我们</li>
                            <li>加入我们</li>
                            <li>版权声明</li>
                        </ul>
                    </li>
                    <li>研发
                        <ul>
                            <li>PHP开发</li>
                            <li>前端开发</li>
                            <li>JAVA开发</li>
                            <li>Android开发</li>
                        </ul>
                    </li>
                    <li>关注
                        <ul>
                            <li>新浪微博</li>
                            <li>腾讯微博</li>
                            <li>企业微信</li>
                            <li>QQ空间</li>
                        </ul>
                    </li>
                    <li>留言
                        <ul>
                            <li>意见反馈</li>
                            <li>问题留言</li>
                            <li>媒体联络</li>
                            <li>在线客服</li>
                        </ul>
                    </li>
                    <li><img src="images/weixin.png" alt="微信关注" width="30" height="27" />微信关注
                        <ul>
                            <li><img src="images/qrcode.jpg" alt="扫描官方微信" title="" width="102px" height="102px" /></li>
                        </ul>
                    </li>
                </ul>
            </div>
        <!--footer end-->
    </div>

</div>
</body>
</html>