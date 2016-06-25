<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户管理</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <body>
  <div id="all" align="center">
    	<h1>用户管理</h1>
    		<form action="successlogin.jsp" method="post" style="height: 147px; ">
    			<table align="center" style="width: 910px; "  border="5">
    		
    				<tr>
    					<td colspan="5" style="width: 500px; ">
    						<a href="adduser.jsp">添加用户</a>
    					</td>
    					<td style="width: 100px; ">
    						<a href="successlogin.jsp">返回主页</a>
    					</td>
    				</tr>
    				<tr>
    					<td style="width: 100px; ">编号</td>
    					<td style="width: 100px; ">用户名</td>
    					<td style="width: 100px; ">密码</td>
    					<td style="width: 100px; ">权限</td>
    					<td style="width: 200px; "colspan="2">操作</td>    				    				   					
    				</tr>
    				<tr>
    					<td style="width: 100px; ">001</td>
    					<td style="width: 100px; ">admin</td>
    					<td style="width: 100px; ">admin</td>
    					<td style="width: 100px; ">手机用户</td>
    					<td style="width: 100px; "><a href="updateuser.jsp">修改</a></td> 
    					<td style="width: 100px; "><a href="delete.jsp">删除</a></td>    				    				   					
    				</tr>
    				<tr>
    					<td style="width: 100px; ">首页</td>
    					<td style="width: 100px; ">上一页</td>
    					<td style="width: 100px; ">下一页</td>
    					<td style="width: 100px; ">最后一页</td>
    					<td style="width: 200px; "colspan="2"></td>    				    				   					
    				</tr>
    			</table>
    		</form>
    	</div>
    </div>
  </body>
</html>