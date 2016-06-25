<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    
    <title>登陆界面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	

  </head>
  
 <body>
    <div id="all" align="center">
    	<h1>欢迎使用冰箱管理系统</h1>
    		<form action="successlogin.jsp" method="post">
    			<table align="center"  border="5">
    		
    				<tr>
    					<td>用户名</td>
    					<td><input type="text" name="name"/></td>
    				</tr>
    				<tr>
    					<td>密码</td>
    					<td><input type="password" name="pwd"/></td>
    				</tr>
    				<tr>
    					<td colspan="2">
    						<input type="submit" value="登录"/>&nbsp;&nbsp;
    						<input type="reset" value="取消"/>&nbsp;&nbsp;
    					</td>
    				</tr>
    			</table>
    		</form>
    
    </div>
  </body>
</html>