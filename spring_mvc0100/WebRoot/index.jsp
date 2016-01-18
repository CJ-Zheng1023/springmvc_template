<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>index</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<%--<script type="text/javascript" src="support/jquery/jquery-1.9.0.js"></script>
	<script type="text/javascript">
	$(function(){
	})
	</script>
  --%></head>
  
  <body>
    welcome  <sec:authentication property="name"></sec:authentication>
    <sec:authorize ifAllGranted="ROLE_ADMIN">
        <a href="admin.jsp">进入管理员页面</a>
    </sec:authorize>
    
    
  </body>
</html>
