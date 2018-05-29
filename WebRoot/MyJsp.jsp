<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>注册已提交</title>
    <link rel="shortcut icon" href="favicon.ico" type="image/x-icon" />
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="css/bootstrap.min.css">
<style type="text/css">
		html{background: -webkit-gradient(linear, left top, left bottom, from(#1b58b2), color-stop(98%, #4fbfe8));}
		body{
			background-color: transparent;
			background-image: url(bg_backdrop_default.png);
			background-position: center bottom;
			background-repeat: no-repeat;
			background-size: contain;

			padding-top: 20px;
			padding-bottom: 20px;
		}
		.header,.marketing,.footer{
			padding-left: 15px;
			padding-right: 15px;
		}
		.header{
			padding-bottom: 20px;
			border-bottom: 1xp solid #e5e5e5;
		}
		.header h3{
			margin-top: 0;
			margin-bottom: 0;
			line-height: 40px;
		}
		.footer{
			padding-top: 19px;
			color: #777;
			border-top: 1px solid #e5e5e5;
		}
		@media(min-width:768px){
			.container{
				max-width: 730px;
			}
		}
		.container-narrow > hr{
			margin: 30px 0;
		}
		.jumbotron{
			text-align: center;
			border-bottom: 1px solid #e5e5e5;
			background-color: #276fbe;
		}
		.jumbotron .btn{
			padding: 14px 24px;
			font-size: 21px;
		}
		.marketing{
			margin: 40px 0;
		}
		.marketing p + h4{
			margin-top: 28px;
		}
		@media screen and (min-width:768px){
			.header,.marketing,.footer{
				padding-left: 0;
				padding-right: 0;
			}
			.header{
				margin-bottom: 30px;
			}
			.jumbotron{
			border-bottom: 0;
			}
		}

	</style>
  </head>
  
  <body>
<script src="js/ThecorevaluesofChinesesocialism.js"></script>
	<div class="container"><!--内容框架-->
		<div class="header clearfix">
			<!--导航块-->
			<nav>
				<ul class="nav nav-pills pull-right">
					<li role="presentation" class="active"><a href="#">主页</a></li>
					<li role="presentation"><a href="#">关于</a></li>
					<li role="presentation"><a href="#">联系</a></li>
				</ul>
			</nav>
		</div>
		<div class="jumbotron">
			<h3>注册已提交</h3>
			<p class="lead">请等待审核通过</p>
			<p><a class="btn btn-success" href="index.jsp" role="button">登录</a></p>
		</div>
		<div class="row marketing"><!--板块内容-->
			<div class="col-lg-12">
				<h4>提示</h4>
				<p>注册成功时，我们会将您的教师编号通过邮件发送给您，届时您可以通过教师编号和密码登录本系统。</p>
			</div>
		</div>
		<footer class="footer">
			<p>&copy;选课信息系统  2018</p>
		</footer>
	</div><!--container结束-->
  </body>
</html>
