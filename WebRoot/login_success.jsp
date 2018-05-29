<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    <link rel="shortcut icon" href="favicon.ico" type="image/x-icon" />
    <title>登陆后的页面</title>
	<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>

  </head>
  
  <body>
<!--   EL表达式 -->
  	  Welcome!${sessionScope.username}<br>
  	  Welcome!${username}<br>
	  <%--  在线人数：${application.count}（直接访问不显示） --%><br><!-- 仅一次请求有效 -->
	  <%-- 在线人数：${applicationScope.count}（但不能统计在线用户数量，即同一个用户可以同时存在于不同会话） --%><!-- 全局有效 -->
	  <a href="logout.action">登出</a>
	  
  <%-- struts2使用的是OGNL表达式，JSP使用的是EL表达式,在该标签中不能使用EL表达式：${sessionScope.属性名} --%>
<%--   <s:if test="#application.count==0">
	  Welcome!${sessionScope.username}<br/>
	  ${application.count}
	  <a href="testlogout.action">登出</a>
  </s:if> --%>
  <!-- <input type="button" value="返回" onclick="javascript:history.go(-1)" style="float: right;" /> -->
  </body>
</html>