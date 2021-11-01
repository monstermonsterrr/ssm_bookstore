<%--
  Created by IntelliJ IDEA.
  User: kgako
  Date: 2021/9/22
  Time: 8:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

%>
<html>
<head>
<base href="<%=basePath %>" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Insert title here</title>
</head>
<body>

<form method="post" action="save" >
    <label>姓名：</label>
    <input type="text" value="username" id="username" placeholder="请输入您的姓名">
    <label>密码：</label>
    <input type="password" value="password" placeholder="请输入您的密码">
    <button type="submit"  >提交</button>
</form>
</body>
<script>
</script>
</html>