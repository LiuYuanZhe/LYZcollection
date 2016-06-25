<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加用户</title>
    
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
    	<h1>添加用户</h1>
    		<form action="usermanager.jsp" method="post">
    			<table align="center"  border="5">
    		
    				<tr>
    					<td>用户名</td>
    					<td><input type="text" name="name"/></td>
    				</tr>
    				<tr>
    					<td>密码</td>
    					<td><input type="text" name="pwd"/></td>
    				</tr>
    				<tr>
    					<td>权限</td>
    					<td><select name="power">
    					
    					<option value="power1"selected>手机用户</option> </selected>
    					<option value="poewr2" selected>管理员</option></selected>
    					
    					 </select></td>
    				</tr>
    				<tr>
    					<td colspan="2">
    						<input type="submit" value="修改"/>&nbsp;&nbsp;
    						<input type="reset" value="取消"/>&nbsp;&nbsp;
    					</td>
    				</tr>
    			</table>
    		</form>
    	</div>
    </div>
  </body>
</html>